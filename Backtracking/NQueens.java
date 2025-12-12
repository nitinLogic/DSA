//This code puts n queens on a nxn chess board such that none of the queens cancel each other
import java.util.*;

public class NQueens {
    public static void printBoard(char board[][]){
        System.out.println("-------- chess board --------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Function to check if given position is safe for positing the queen
    public static boolean isSafe(char board[][], int row, int col){
        //Vertical up
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q')
                return false;
        }

        //Diagonal top left
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q')
                return false;
        }

        //Diagonal top right
        for(int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++){
            if(board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    static int count = 0;

    public static void queens(char board[][], int row){
        //Base case
        if(row >= board.length){
            printBoard(board);
            count++;
            return;
        }

        for(int j = 0; j < board[0].length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';    //Place the queen
                queens(board, row + 1);     //Place queen in next row
                board[row][j] = 'x';    //Remove the queen
            }
        }
        return;
    }

    public static boolean checkQueenSoln(char board[][], int row){
        //Base case
        if(row >= board.length){
            return true;
        }

        for(int j = 0; j < board[0].length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';    //Place the queen
                if(checkQueenSoln(board, row + 1))
                    return true;
                board[row][j] = 'x';    //Remove the queen
            }
        }
        return false;
    }

    public static void main(String args[]){
        int n = 4;
        
        char board[][] = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'x';
            }
        }

        // queens(board, 0);
        // System.out.println("Total possible: " + count);
        if(checkQueenSoln(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
    }
}
