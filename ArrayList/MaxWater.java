//This code computes maximum water that can be stored in a container formed by two lines & base
import java.util.*;

public class MaxWater {
    //Two pointer approach
    public static int containerMaxWater_2Ptr(ArrayList<Integer> height){
        int maxWater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = height.size() - 1;

        while(lp < rp){
            //Calculate water
            int length = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            maxWater = Math.max(maxWater, length * width);

            //Update pointer
            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        
        return maxWater;
    }

    //Brute force method - O(n^2)
    public static int containerMaxWater_Brute(ArrayList<Integer> height){
        int maxWater = Integer.MIN_VALUE;

        for(int i = 0; i < height.size(); i++){
            for(int j = i + 1; j < height.size(); j++){
                int width = Math.min(height.get(i), height.get(j));
                int length = j - i;

                maxWater = Math.max(maxWater, width * length);
            }
        }

        return maxWater;
    }

    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(containerMaxWater_Brute(height));
        System.out.println(containerMaxWater_2Ptr(height));
    }
}
