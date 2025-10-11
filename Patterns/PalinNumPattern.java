//This program prints a Palindromic pattern with numbres
import java.util.*;

public class PalinNumPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter height of pattern: ");  //Input pattern height from user
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            
            //Print spaces before pattern on ith line
            for(int j = 1; j <= (n - i); j++)
                System.out.print(" ");

            //Print left side pattern on ith line
            for(int j = i; j >= 1; j--)
                System.out.print(j);

            //Print right side pattern on ith line
            for(int j = 2; j <= i; j++)
                System.out.print(j);

            System.out.println();
        }
    }
}
