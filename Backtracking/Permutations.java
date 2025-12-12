//This code prints all permutations of a given string
import java.util.*;

public class Permutations {
    public static void allPermutations(String str, String ans){
        //Base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            allPermutations(newStr, ans + ch);
        }
    }

    public static void main(String args[]){
        String str = "abc";
        allPermutations(str, "");
    }
}
