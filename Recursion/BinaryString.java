//This code prints all binary strings of size n without consecutive zeroes
import java.util.*;

public class BinaryString {
    public static void binString(int n, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        
        binString(n - 1, str + '0');

        if(str.length() == 0 || str.charAt(str.length() - 1) != '1')
            binString(n - 1, str + '1');

        return;
    }
    public static void main(String args[]){
        int n = 4;
        binString(n, new String(""));
    }
}
