//This code finds the target immediately followed by key that occurs maximum times
import java.util.*;

public class MostFrequentNumber {
    public static int findTarget(ArrayList<Integer> list, int key){
        int num[] = new int[1000];

        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) == key){
                num[list.get(i + 1) - 1]++;
            }
        }

        int maxOccur = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i < num.length; i++){
            if(maxOccur < num[i]){
                maxOccur = num[i];
                ans = i + 1;
            }
        }

        return ans;    
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        int key = 2;

        System.out.println(findTarget(list, key));
    }
}
