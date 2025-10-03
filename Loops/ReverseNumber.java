//This code reverses a given number 
import java.util.*;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev_n = 0;
        int neg = 0;

        //Case when n < 0
        if(n < 0){
            n *= -1;
            neg = 1;
        }

        //Remove the ending zeroes. Also, consider the case when n = 0
        while(n != 0 && n % 10 == 0)
            n = n / 10;

        if(n != 0){
            while(n > 0){
                rev_n = (rev_n * 10) + (n % 10);
                n /= 10;    
            }
        }
        else    //Case when n = 0
            rev_n = n;

        if(neg == 1){
            rev_n *= -1;
        }
        System.out.println("Reverse of n is " + rev_n);
    }
}
