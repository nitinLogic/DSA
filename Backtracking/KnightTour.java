//This code prints order of each cell in a nxn size board in which it is visited by a knight
import java.util.*;

public class KnightTour {
    static int n = 7;

    public static void printArr(int board[][]){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(board[i][j] + "  ");
            }
            System.out.print("\n\n");
        }
    }

    public static boolean isSafe(int board[][], int row, int col){
        //Within boundary
        if(row < 0 || row >= n || col < 0 || col >= n)
            return false;

        //Not visited
        if(board[row][col] != -1)
            return false;

        return true;
    }

    public static boolean knight(int board[][], int row, int col, int count, int xMove[], int yMove[]){
        //Base case
        if(count == n * n){
            return true;
        }

        for(int i = 0; i < 8; i++){
            int nextRow = row + xMove[i];
            int nextCol = col + yMove[i];

            if(isSafe(board, nextRow, nextCol)){
                board[nextRow][nextCol] = count;
                
                if(knight(board, nextRow, nextCol, count + 1, xMove, yMove))
                    return true;

                //Backtrack
                board[nextRow][nextCol] = -1;
            }
        }
        return false;
    }

    public static void main(String args[]){
        
        int board[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = -1;
            }
        }
        
        int xMove[] = {2,2,-2,-2,1,1,-1,-1};
        int yMove[] = {1,-1,1,-1,2,-2,2,-2};
        board[0][0] = 0;

        if(!knight(board, 0, 0, 1, xMove, yMove))
            System.out.println("Solution not possible");

        else{
            System.out.println("Solution is possible");
            printArr(board);
        }
    }
}
