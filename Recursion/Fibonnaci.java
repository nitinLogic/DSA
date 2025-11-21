//This code prints nth fibbonaci number using recursion (use 0 as first fibonnaci number)
import java.util.*;

public class Fibonnaci {
    public static int fib(int n){
        if(n == 0 || n ==1)
            return n;
        
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("nth Fibbonaci Numbers: " + fib(n));
    }
}
