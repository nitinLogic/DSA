//This code checks if a given string is palindrome
import java.util.*;

public class PalindromeStr {
    public static boolean checkPalin(String str){
        int n = str.length();

        for(int i = 0; i < n / 2; i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print(checkPalin(str) ? "Is Palindrome" : "Is not Palindrome");
    }
}
