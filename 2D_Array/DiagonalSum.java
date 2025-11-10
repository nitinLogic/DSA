//This code calculates sum of diagonals of a square matrix
import java.util.*;

public class DiagonalSum {
    //Brute force approach
    public static void BruteForce(int matrix[][]){
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                //Primary diagonal sum
                if(i == j){
                    sum += matrix[i][j];
                }//Secondary diagonal sum
                else if(i + j == matrix.length - 1){
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Diagonal sum by brute force approach: " + sum);
    }

    //Optimised approach
    public static void Optimised(int matrix[][]){
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            //Primary diagonal sum
            sum += matrix[i][i];

            if(i != matrix.length - 1 - i){
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        System.out.println("Diagonal sum by optimised approach: " + sum);
    }

    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}, 
                            {13, 14,15,16}};
        BruteForce(matrix);
        Optimised(matrix);
    }
}
