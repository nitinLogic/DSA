//This code removes duplicate from a given string
import java.util.*;

public class RemoveDuplicate {
    public static void remDuplicate(String str, int idx, StringBuilder sb, boolean map[]){
        //Base case
        if(idx >= str.length()){
            System.out.println(sb);
            return;
        }

        //When character is occuring for first time
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == false){
            map[currChar - 'a'] = true;
            sb.append(currChar);
        }

        remDuplicate(str, idx + 1, sb, map);
    }

    public static void main(String args[]){
        String str = "appnnacollege";
        boolean map[] = new boolean[26];
        remDuplicate(str, 0, new StringBuilder(""), map);
    }
}
