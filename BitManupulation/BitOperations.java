//This code implements operations on bits
import java.util.*;

public class BitOperations {
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0)
            return 0;
        else
            return 1;
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        n = (n | bitMask);
        return n;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        n = (n & bitMask);
        return n;
    }

    public static int updateIthBit(int n, int i, int newBit){
        //It could be done using clearIthBit & setIthBit functions
        //But we will solve by little bit different approach
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    //Function to clear last i bits
    public static int clearIBits(int n, int i){
        int bitMask = ((~0) << i);
        return n & bitMask;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        
        System.out.println(getIthBit(n, i));
        System.out.println(setIthBit(n, i));
        System.out.println(clearIthBit(n, i));
        System.out.println(updateIthBit(n, i, 1));
        System.out.println(clearIBits(n, i));
    }
}