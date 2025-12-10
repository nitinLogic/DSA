//This code prints all subsets of a given string
import java.util.*;

public class Subsets {
    static int count = 0;
    public static void printSubsets(String str, String ans, int idx){
        //Base case
        if(idx >= str.length()){
            System.out.println(ans);
            count++;
            return;
        }

        printSubsets(str, ans + str.charAt(idx), idx + 1);
        printSubsets(str, ans, idx + 1);

        return;
    }

    public static void main(String args[]){
        String str = new String("abc");
        printSubsets(str, "", 0);
        System.out.println("Total: " + count);
    }
}
