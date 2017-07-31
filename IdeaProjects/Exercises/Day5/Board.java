import java.util.Scanner;

/**
 * Created by ruplaga on 7/17/2017.
 */
public class Board {

    private static int checkWinner(int[] boardPosition) {
        for (int i = 0; i < 7; i += 3) {
            if(boardPosition[i] == boardPosition[i+1] && boardPosition[i+1] == boardPosition[i+2] ) {
                return boardPosition[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if(boardPosition[i] == boardPosition[i+3] && boardPosition[i+3] == boardPosition[i+6] ) {
                return boardPosition[i];
            }
        }
        if (boardPosition[0] == boardPosition[4] && boardPosition[4] == boardPosition[4] ) {
            return boardPosition[0];
        }
        if (boardPosition[2] == boardPosition[4] && boardPosition[4] == boardPosition[8] ) {
            return boardPosition[2];
        }
        return 2;
    }

    public static void main(String[] args) {
        int []boardPosition = {1, 0, 0, 0, 1, 1, 0, 0, 1};//new int[9];
       /* Scanner sc = new Scanner(System.in);
        for( int i = 0; i < 9; i++) {
            boardPosition[i] = sc.nextInt();
        }*/
        int winner = checkWinner(boardPosition);
        System.out.println("winner:" + winner);
    }

}
