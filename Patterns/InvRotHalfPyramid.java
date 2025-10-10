//This code will print an Inverted Rotated Half Pyramid
import java.util.*;

public class InvRotHalfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter length of pattern: ");  //Input pattern length from user
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                
                if(j >= 1 && j < n - i + 1)
                    System.out.print(" ");
                else
                    System.out.print("*");

            }
            System.out.println();
        }
    }
}
