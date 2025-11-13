//This code searches a key in a sorted 2D matrix
import java.util.*;

public class SearchSortedMatrix {
    //Search starting from top right corner
    public static boolean staircaseSearch_tr(int matrix[][], int key){
        int row = 0, col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key found at (" + row + ", " + col + ")");
                return true;
            }
            else if(key > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("Key not found !");
        return false;
    }

    //Search starting from bottom left corner
    public static boolean staircaseSearch_bl(int matrix[][], int key){
        int row = matrix.length - 1, col = 0;

        while(row >= 0 && col < matrix[0].length){
            if(key == matrix[row][col]){
                System.out.println("Key found at (" + row + ", " + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found !");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 33;
        staircaseSearch_tr(matrix, key);
        staircaseSearch_bl(matrix, key);
    }
}
