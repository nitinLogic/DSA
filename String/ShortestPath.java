//This code computes shortest path to reach destination by route containing 4 directions(E, W, N, S)
import java.util.*;

public class ShortestPath {
    public static double getPath(String str){
        int x = 0, y = 0;
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'E')
                x++;
            else if(str.charAt(i) == 'W')
                x--;
            else if(str.charAt(i) == 'N')
                y++;
            else
                y--;
        }

        double pathLength = Math.sqrt((x * x) + (y * y));
        return pathLength;
    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getPath(path));
    }
}
