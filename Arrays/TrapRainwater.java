//This code computes the amount of rainwater trapped in between buildings of width one
import java.util.*;

public class TrapRainwater {
    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int n = height.length;

        //Auxiliary array for rightmax boundary
        int right[] = new int[n];
        for(int i = n - 1; i >= 0; i--){
            right[i] = (i == n - 1 ? height[i] : Math.max(right[i + 1], height[i]));
        }

        //Auxiliary array for leftmax boundary
        int left[] = new int[n];
        for(int i = 0; i < n; i++){
            left[i] = (i == 0 ? height[i] : Math.max(left[i - 1], height[i]));
        }

        int water = 0;
        for(int i = 0; i < n; i++){
            water += Math.min(left[i], right[i]) - height[i];
        }
        System.out.println("Amount of water trapped: " + water);
    }
}
