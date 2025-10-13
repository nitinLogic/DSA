//This code converts Binary number to Decimal number & vice-versa
import java.util.*;

public class BinToDec {
    //Function to convert Binary to Decimal number
    public static int binToDec(int n){
        int dec = 0;

        for(int i = 0; n > 0; i++){
            dec += (n % 10) * Math.pow(2, i);
            n /= 10;
        }
        return dec;
    }

    //Function to convert Decimal to Binary number
    public static int decToBin(int n){
        int bin = 0;

        for(int i = 0; n > 0; i++){
            bin += (n % 2) * Math.pow(10, i);
            n /= 2;
        }
        return bin;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        int bin = sc.nextInt();
        System.out.println("Decimal of " + bin + " number : " + binToDec(bin));

        System.out.print("Enter the decimal number: ");
        int dec = sc.nextInt();
        System.out.println("Binary of " + dec + " number : " + decToBin(dec));
    }
}
