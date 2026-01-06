//This code computes amount of water trapped between bars using stack data structure
import java.util.*;

public class TrapRainWaterStack {
    public static int trappedWater(int height[]){
        int water = 0;
        
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < height.length; i++){
            
            while(!s.isEmpty() && height[s.peek()] < height[i]){
                int top = height[s.peek()];
                s.pop();
                if(s.isEmpty()){
                    break;
                }
                int width = i - s.peek() - 1;
                int length = Math.min(height[s.peek()], height[i]) - top;

                water += (width * length);
            }
            s.push(i);
        }

        return water;
    }

    public static void main(String args[]){
        int height[] = {7,0,4,2,5,0,6,4,0,5};
        System.out.println("Trapped water: " + trappedWater(height));
    }
}
