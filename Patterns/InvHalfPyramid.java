//This program prints an Inverted Half Pyramid with numbers pattern
import java.util.*;

public class InvHalfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter length of pattern: ");  //Input pattern length from user
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}