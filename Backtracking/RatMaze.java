//This code computes number of paths of rat going from source to destination on a 2D grid with blockages
import java.util.*;

public class RatMaze {
    public static boolean isSafe(int maze[][], int row, int col){
        int n = maze.length;

        //Outside boundary
        if(row < 0 || row >= n || col < 0 || col >= n){
            return false;
        }

        //Blocked cell
        if(maze[row][col] == 0)
            return false;

        //Already visited
        if(maze[row][col] == -1)
            return false;

        return true;
    }

    public static void allPossiblePaths(int maze[][], String ans, int row, int col){
        int n = maze.length;
        
        //When rat reached the bottom-right corner
        if(row == n - 1 && col == n - 1){
            System.out.println(ans);
            return;
        }

        if(isSafe(maze, row, col)){
            maze[row][col] = -1;

            allPossiblePaths(maze, ans + "U", row - 1, col);
            allPossiblePaths(maze, ans + "D", row + 1, col);
            allPossiblePaths(maze, ans + "L", row, col - 1);
            allPossiblePaths(maze, ans + "R", row, col + 1);

            maze[row][col] = 1;
        }
    }

    public static void main(String args[]){
        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}
        };

        //Rat starts from top-left corner
        allPossiblePaths(maze, "", 0, 0);
    }
}
