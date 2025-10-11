//This program prints a number pyramid
import java.util.*;

public class NumPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter height of pattern: ");  //Input pattern height from user
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //Print spaces before pattern in ith line
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            //Print pattern in ith line
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
