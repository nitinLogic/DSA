//Place tiles of size (2 x 1) on a floor of size (2 x n)
import java.util.*;

public class Tiling {
    public static int tiling(int n){
        //Base case
        if(n == 0 || n == 1)
            return 1;

        return tiling(n - 1) + tiling(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("No. of ways of tiling floor: " + tiling(n));
    }
}