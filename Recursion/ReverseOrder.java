//This code prints first n natural numbers in reverse order using recursion
import java.util.*;

public class ReverseOrder {
    public static void printReverse(int n){
        if(n == 1){
            System.out.print("1 ");
            return;
        }
        System.out.print(n + " ");
        printReverse(n - 1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printReverse(n);
    }
}
