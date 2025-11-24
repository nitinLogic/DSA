//This code prints power x^n
import java.util.*;

public class Power{
    public static int pow(int x, int n){
        if(n <= 0)
            return 1;
        return x * pow(x, n - 1);
    }
    public static int optimisePow(int x, int n){
        if(n == 0)
            return 1;
        int halfPow = optimisePow(x, n / 2);
        int ans = halfPow * halfPow;

        if(n % 2 != 0){
            ans = x * ans;
        }

        return ans;
    }
    public static void main(String args[]){
        int x = 2, n = 30;
        System.out.println(pow(x, n));
        System.out.println(optimisePow(x, n));
    }
}
