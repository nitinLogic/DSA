//This code prints a given number (not ending with digit zero) into string of english
import java.util.*;

public class NumToString {
    public static void printString(int n, String num[]){
        //Base case
        if(n == 0){
            return;
        }

        printString(n / 10, num);
        System.out.print(num[n % 10] + " ");
        return;
    }
    public static void main(String args[]){
        String num[] = new String[10];
        num[0] = "zero";
        num[1] = "one";
        num[2] = "two";
        num[3] = "three";
        num[4] = "four";
        num[5] = "five";
        num[6] = "six";
        num[7] = "seven";
        num[8] = "eight";
        num[9] = "nine";

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printString(n, num);
    }
}
