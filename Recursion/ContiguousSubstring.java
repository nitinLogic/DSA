//This code counts all contiguous substrings starting & ending with same character
import java.util.*;

public class ContiguousSubstring {
    public static int allOccurStr(int idx, char key, String str){
        //Base case
        if(idx == str.length()){
            return 0;
        }
        if(str.charAt(idx) == key)
            return 1 + allOccurStr(idx + 1, key, str);
        return allOccurStr(idx + 1, key, str);
    }
    public static void main(String args[]){
        String s = "abcab";
        int cntSubStr = 0;
        for(int i = 0; i < s.length(); i++){
            cntSubStr += allOccurStr(i, s.charAt(i), s);
        }
        System.out.println(cntSubStr);
    }
}