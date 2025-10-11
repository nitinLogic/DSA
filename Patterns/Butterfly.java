//This code prints a Butterfly pattern
import java.util.*;

public class Butterfly {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern: ");
        int n = sc.nextInt();

        //Print top part of butterfly
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n; j++){
                if((j >= 1 && j <= i) || (j >= (2*n - i + 1) && j <= 2*n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print('\n');
        }

        //Print bottom part of butterfly
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n; j++){
                if((j >= 1 && j <= (n - i + 1)) || (j >= (n + i) && j <= 2*n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print('\n');
        }
    }
}
