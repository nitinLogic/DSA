//This code prints Diamond pattern
import java.util.*;

public class Diamond {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter length of pattern: ");  //Input pattern length from user
        int n = sc.nextInt();

        //Print top part of pattern
        for(int i = 1; i <= n; i++){

            //Print spaces before ith line
            for(int j = 1; j <= (n - i); j++)
                System.out.print(" ");

            //Print ith line
            for(int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println();
        }

        //Print bottom part of pattern
        for(int i = n; i >= 1; i--){

            //Print spaces before ith line
            for(int j = 1; j <= (n - i); j++)
                System.out.print(" ");

            //Print ith line
            for(int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
