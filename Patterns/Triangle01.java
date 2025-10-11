//This code prints a 0-1 Triangle pattern
import java.util.*;

public class Triangle01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of pattern: ");  //Input pattern length from user
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            
            int x = ((i % 2 == 0) ? 0 : 1); //Even number lines start with zero

            for(int j = 1; j <= i; j++){
                System.out.print(x);
                x = ((x == 0) ? 1 : 0);     //Change one to zero & vice-versa
            }

            System.out.println();
        }
    }
}
