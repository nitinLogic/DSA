//This code calculates binomial coefficient using a factorial function
import java.util.*;

public class BinomialCoeff{

    //Function to calculate factorial
    public static int fact(int n){
        if(n == 0)
            return 1;
        
        int f = 1;
        while(n > 0){
            f = f * n;
            n--;
        }

        return f;
    }

    //This function calculates Binomial Coefficient
    public static int binCoefficient(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n - r);

        return fact_n / (fact_r * fact_nmr);
    }

    public static void main(String args[]){
        System.out.println(binCoefficient(5, 2));
    }
}