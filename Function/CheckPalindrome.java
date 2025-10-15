//This code checks if a given number is a palindrome
import java.util.*;

public class CheckPalindrome {

    //Function to reverse a number
    public static int revNum(int n){
        int rev_n = 0;
        while(n > 0){
            rev_n = (rev_n * 10) + (n % 10);
            n /= 10;
        }
        System.out.println(rev_n);
        return rev_n;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = sc.nextInt();

        System.out.println(n == revNum(n) ? "Yes" : "No");
    }
    
}
