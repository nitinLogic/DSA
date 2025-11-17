//This code clears bits in a given range
import java.util.*;

public class ClearRangeBits {
    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = (a | b);
        return (n & bitMask);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(clearBitsInRange(n, 2, 4));
    }
}
