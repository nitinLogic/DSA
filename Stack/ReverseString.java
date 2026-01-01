//This code reverses a string using stack
import java.util.*;

public class ReverseString {
    public static String reverseStringUsingStack(Stack<Character> st, String str){
        int idx = 0;
        while(idx != str.length()){
            st.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.toString();
    }

    public static void main(String args[]){
        Stack<Character> st = new Stack<>();
        String str = "abc";
        System.out.println(reverseStringUsingStack(st, str));
    }
}
