//This code computes sum of first n natural numbers using recursion
import java.util.*;

public class sumNatural {
    public static int sum(int n){
        if(n == 0)
            return 0;
        return n + sum(n - 1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Sum: " + sum(n));
    }
}
