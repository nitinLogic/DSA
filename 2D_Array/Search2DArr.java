//This code searches given element in a 2D array
import java.util.*;

public class Search2DArr{
    //Create a 2D array
    public static void createMatrix(int matrix[][], int m, int n){
        System.out.print("Enter elements for matrix: ");

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix);
    }

    //Print 
    public static void printMatrix(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Search in a matrix
    public static boolean searchMatrix(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    //Max & Min value in a matrix
    public static void rangeMatrix(int matrix[][]){
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                minVal = Math.min(minVal, matrix[i][j]);
                maxVal = Math.max(maxVal, matrix[i][j]);
            }
        }
        System.out.println("Maximum value: " + maxVal);
        System.out.println("Minimum value: " + minVal);
    }

    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        
        createMatrix(matrix, matrix.length, matrix[0].length);
        rangeMatrix(matrix);
        
        System.out.print("Enter the key to be searched: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        searchMatrix(matrix, key);
    }
}