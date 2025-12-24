//This code returns a permutation of integers in range [1,n] such that
//for every 0 <= i < j < n, there is no index k with i < k < j
import java.util.*;

public class BeautifulArrayList {
    public static ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for(int i = 2; i <= n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            
            //Odd
            for(int el:ans){
                if(2 * el - 1 <= n)
                    temp.add(2 * el - 1);
            }

            //Even
            for(int el:ans){
                if(2 * el <= n)
                    temp.add(2 * el);
            }

            ans = temp;
        }

        return ans;
    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(beautifulArray(n));
    }
}
