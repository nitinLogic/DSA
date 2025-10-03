//This code calculates factorial of a given number (Limited for not very large numbers)
import java.util.*;

public class Factorial {
    public static void main(String main[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        int z = n;      //To print final answer
        int fact = 1;       //Factorial of 0 is 1

        //Multiply numbers from n to 1
        while(n > 0){
            fact *= n;
            n--;
        }

        System.out.println(z + "! = " + fact);
    }
}
