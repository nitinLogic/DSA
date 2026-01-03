//This code finds the first greatest element 
//to the right in a given array (will also be doing other variations of this)
import java.util.*;

public class NextGreatestRight {
    public static void nGR(int arr[], int nextGR[]){
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }

            if (s.isEmpty()) {
                nextGR[i] = -1;
            }
            else{
                nextGR[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void nGL(int arr[], int nextGL[]){
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }

            if (s.isEmpty()) {
                nextGL[i] = -1;
            }
            else{
                nextGL[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void nSR(int arr[], int nextSR[]){
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }

            if (s.isEmpty()) {
                nextSR[i] = -1;
            }
            else{
                nextSR[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void nSL(int arr[], int nextSL[]){
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }

            if (s.isEmpty()) {
                nextSL[i] = -1;
            }
            else{
                nextSL[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void printArr(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {6, 8, 0, 1, 3};
        int nextGR[] = new int[arr.length];
        nGR(arr, nextGR);
        System.out.print("Next Greatest Right: ");
        printArr(nextGR);

        int nextGL[] = new int[arr.length];
        nGL(arr, nextGL);
        System.out.print("Next Greatest Left: ");
        printArr(nextGL);

        int nextSR[] = new int[arr.length];
        nSR(arr, nextSR);
        System.out.print("Next Smallest Right: ");
        printArr(nextSR);

        int nextSL[] = new int[arr.length];
        nSL(arr, nextSL);
        System.out.print("Next Smallest Left: ");
        printArr(nextSL);
    }
}
