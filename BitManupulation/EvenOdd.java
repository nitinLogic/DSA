//This code checks if a number is even or odd usinng Bit Manupulation
import java.util.*;

public class EvenOdd {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddOrEven(n);
    }
}
