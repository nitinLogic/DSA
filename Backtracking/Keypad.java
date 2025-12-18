//This code prints all letter possible combinations of a number typed on a numpad (2 to 9)
import java.util.*;

public class Keypad {
    public static void allCombinations(String str, String ans, String numpad[], int idx){
        //Bsse case
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }

        int curr_num = str.charAt(idx) - '0' - 1;

        //Iterating over each character of current number
        for(int i = 0; i < numpad[curr_num].length(); i++){
            char curr_ch = numpad[curr_num].charAt(i);

            allCombinations(str, ans + curr_ch, numpad, idx + 1);
        }
    }

    public static void main(String args[]){
        //Initializing the keypad
        String numpad[] = new String[9];
        numpad[0] = "";
        numpad[1] = "abc";
        numpad[2] = "def";
        numpad[3] = "ghi";
        numpad[4] = "jkl";
        numpad[5] = "mno";
        numpad[6] = "pqrs";
        numpad[7] = "tuv";
        numpad[8] = "wxyz";

        //Input string
        String str = "23";

        allCombinations(str, "", numpad, 0);
    }

}
