//This code checks if a number is prime
import java.util.*;

public class CheckPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n == 1){
            System.out.println(n + " is neither prime nor composite");
        }
        else if(n == 2){
            System.out.println(n + " is a prime number");
        }
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){     //Number divisble by 1 and itself are only prime numbers
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true)
                System.out.println(n + " is a prime number");
            else
                System.out.println(n + " is not a prime number");
        }

    }
}
