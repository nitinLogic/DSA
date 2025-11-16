//This code checks if a number is even or odd usinng Bit Manupulation
import java.util.*;

public class EvenOdd {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddOrEven(n);
    }
}
