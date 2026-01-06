//This code decodes a string, which is encoded in the form 3[b2[v]]
import java.util.*; 

public class DecodeString {
    public static int reverse(int num){
        int res = 0;
        
        while(num > 0){
            res = (res * 10) + (num % 10);
            num = num / 10;
        }
        
        return res;
    }

    public static String multiply(String str, int n){
        String newStr = "";
        while(n > 0){
            newStr += str;
            n--;
        }

        return newStr;
    }

    public static String decodeString(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ']'){
                s.push(str.charAt(i));
            }
            else{
                //Create current string 
                String curr_str = "";
                while(s.peek() != '['){
                    curr_str = s.pop() + curr_str;
                }
                s.pop();

                //Create multiply factor for current string
                int rev_num = 0;    //Number will be generated in reverse order
                while(!s.isEmpty() && (s.peek() >= '0' && s.peek() <= '9')){
                    int digit = s.pop() - '0';
                    rev_num = (rev_num * 10) + digit;
                }
                
                //Push characters of new string in stack
                String newStr = multiply(curr_str, reverse(rev_num));
                for(int j = 0; j < newStr.length(); j++){
                    s.push(newStr.charAt(j));
                }
            }
        }

        String ans = "";
        while(!s.isEmpty()){
            ans = s.pop() + ans;
        }
        return ans;
    }

    public static void main(String args[]){
        String str = "3[b2[v]]";
        System.out.println("Code: " + str);
        System.out.println("Encoded string: " + decodeString(str));
    }
}
