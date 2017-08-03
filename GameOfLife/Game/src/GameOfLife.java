import java.util.Scanner;

/**
 * Created by jhanward on 7/22/2017.
 */
public class GameOfLife {
    static int n = 5;
    int[][] currentGeneration;

    GameOfLife(int[][] currentGeneration) {
        this.currentGeneration = currentGeneration;
    }

    public int[][] populate() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.currentGeneration[i][j] =  sc.nextInt();
            }
        }
        return this.currentGeneration;
    }

    public boolean isAlive(int i, int j) {
        if(this.currentGeneration[i][j] == 1) {
            return true;
        }
        return false;
    }
    public int countLiveNeighbors(int i, int j) {
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {

            }
        }
        return i;
    }
    public boolean willbeAlive(int status, int neighbours) {
        int newStatus = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int countNeighbors = countLiveNeighbors(i,j);
                newStatus = willbeAlive()
            }
        }
        return false;
    }
}
