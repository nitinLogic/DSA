//This code prints first n natural numbers in reverse order using recursion
import java.util.*;

public class ReverseOrder {
    public static void printDec(int n){
        if(n == 1){
            System.out.print("1 ");
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print("1 ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Increasing Order: ");
        printInc(n);
        System.out.print("\nDeacreasing Order: ");
        printDec(n);
        
    }
}
