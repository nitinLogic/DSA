//This code checks if a number is power of two using bit operations
import java.util.*;

public class PowerOfTwo {
    public static boolean powerOf2(int n){
        return (n & (n - 1)) == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(powerOf2(n));
    }
}