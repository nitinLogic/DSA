//This is code for Bubble sorting an integer array
import java.util.*;

public class BubbleSort {
    
    public static void bubbleSort(int a[]){
        for(int turn = 0; turn < a.length - 1; turn++){
            for(int j = 0; j < a.length - 1 - turn; j++){
                if(a[j + 1] < a[j]){
                    int temp  = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void printArr(int a[]){
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
    
    public static void main(String args[]){
        int a[] = {5, 4, 1, 3, 2};
        bubbleSort(a);
        printArr(a);
    }
}
