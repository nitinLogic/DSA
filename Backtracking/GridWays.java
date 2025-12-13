//This code counts number of ways to reach from source (0, 0) to target (n, m) on a 2D grid
//Note that steps only in right or down direction can be taken
import java.util.*;

public class GridWays{
    public static int countWays(int i, int j, int n, int m){
        //Base case - reached the target
        if(i == n - 1 && j == m - 1){
            return 1;
        }
        else if(i >= n || j >= m){      //Going outside the grid
            return 0;
        }
        int w1 = countWays(i + 1, j, n, m);
        int w2 = countWays(i, j + 1, n, m);

        return w1 + w2;
    }

    //This has reduced time complexity from exponential 2^(n+m) to linear (n+m)
    public static int countWaysOptimise(int n, int m){
        return fact(n - 1 + m - 1) / (fact(n - 1) * fact(m - 1));
    }

    //Function to compute factorial
    public static int fact(int n){
        //Base case
        if(n == 1 || n == 0)
            return n;

        return n * fact(n - 1);
    }

    public static void main(String args[]){
        int n = 3, m = 3;
        System.out.println("Number of grid ways: " + countWays(0, 0, n, m));
        System.out.println("Number of grid ways: " + countWaysOptimise(n, m));
    }
}