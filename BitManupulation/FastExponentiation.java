//This code computes exponent of a number in log n time
import java.util.*;

public class FastExponentiation {
    public static int pow(int x, int n){
        int ans = 1;

        while(n > 0){
            if((n & 1) != 0){
                ans = ans * x;
            }
            x = x * x;
            n = (n >> 1);
        }

        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(pow(x, n));
    }
}
