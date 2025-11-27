//This code computes possible ways in which n friends can remain single or pair up (up two max)
import java.util.*;

public class FriendsPairing {
    public static int possibleWays(int n){
        //Base case
        if(n == 1 || n == 2)
            return n;
        return possibleWays(n - 1) + (n - 1) * possibleWays(n - 2);
    }

    public static void main(String args[]){
        int n = 3;
        System.out.println(possibleWays(n));
    }
}
