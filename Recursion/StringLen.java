//This code computes length of a string using recursion
import java.util.*;

public class StringLen {
    public static void computeLen(StringBuilder str, int len){
        //Base case
        if(str.isEmpty()){
            System.out.println("String length: " + len);
            return;
        }
        str.deleteCharAt(0);
        computeLen(str, len + 1);
        return;
    }
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("Nitin Yadav");
        computeLen(str, 0);
    }
}
