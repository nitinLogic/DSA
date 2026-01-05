//This code computes the area of largest rectangle in the histogram
import java.util.*;

public class MaxAreaHistogram {
    public static int largestRectangleArea(int heights[]){
        int n = heights.length;

        int maxArea = 0;
        int nsr[] = new int[n];
        int nsl[] = new int[n];

        //nsr
        Stack<Integer> s = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--){
            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = n;
            }
            else{
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        //nsl
        s = new Stack<>();
        
        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        //area
        for(int i = 0; i < n; i++){
            int width = nsr[i] - nsl[i] - 1;
            int length = heights[i];
            int area = width * length;
            
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }

    public static void main(String args[]){
        int heights[] = {2,1,5,6,2,3};
        System.out.println("Maximum area: " + largestRectangleArea(heights));
    }
}
