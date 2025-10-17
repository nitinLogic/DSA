//This code finda largest integer in an array
import java.util.*;

public class LargInArray{
    public static int largestArr(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String mains[]){
        int arr[] = {1, 2, 6, 3, 5};
        System.out.println("Largest number in given array is: " + largestArr(arr));
    }
}