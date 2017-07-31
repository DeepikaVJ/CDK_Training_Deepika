import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by ruplaga on 7/17/2017.
 */
public class Grid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Board: ");
        int boardSize = sc.nextInt();                               //can be any value. array is hardcoded here, so enter 3 as boardsize

        int[][] board1 = {{1, 1, 0}, {0, 1, 0}, {0, 0, 1}};         //hardcoded here. can take from user
        int[][] board2 = new int[boardSize][boardSize];

//        System.out.println("Enter values: ");
//        board1 = populateBoard(sc, board1, boardSize);            //user input for board configuration

        int iteration = 3;                  // number of generations

        while (iteration > 0) {
            getNewGeneration(boardSize, board1, board2);            //get next generation
            printBoard(boardSize, board2);
            board1 = clear(board1, board2, boardSize);              //store board2 values back to board1
            iteration--;
        }
    }

    private static int[][] clear(int[][] board1, int[][] board2, int boardSize) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board1[i][j] = board2[i][j];
            }
        }
        return board1;
    }

    private static void getNewGeneration(int boardSize, int[][] board1, int[][] board2) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                int count = getNeighboursCount(board1, i, j, boardSize);                //get count of neighbours
                int value = applyRules(count, board1[i][j]);                            //get value as 1 or 0 based on rules
                board2[i][j] = value;                                                   //store the new values in temp array board2
            }
        }
    }

    private static void printBoard(int boardSize, int[][] board) {
        System.out.println("Next Generation:");
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int applyRules(int count, int cell) {
        if(cell == 1) {                                 //cell is live
            if(count < 2)
                return 0;
            else if (count == 2 || count == 3)
                return 1;
            else if(count > 3)
                return 0;
        }
        else {                                          //cell is dead
            if(count == 3)
                return 1;
        }

        return 0;

    }

    static int getNeighboursCount(int[][] board, int i, int j, int boardSize) {
        int count = 0;

        for(int m = i - 1; m < i+2; m++) {
            if(m >=0 && m < boardSize) {
                for (int n = j -1; n < j+2; n++) {
                    if(n >= 0 && n < boardSize) {
                        if (board[m][n] == 1)
                            count++;
                    }
                }
            }
        }
        if(board[i][j] == 1)                        //the above for loops count the total number of live cells including the current cell. so, if current cell is live, decrement count by 1
            count--;

        return count;

    }

    private static int[][] populateBoard(Scanner sc, int[][] board1, int boardSize) {
        for( int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board1[i][j] = sc.nextInt();
            }
        }
        return board1;
    }
}
