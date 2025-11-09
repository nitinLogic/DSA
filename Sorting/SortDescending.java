//This code sorts an integer array in descending order using different algorithms
import java.util.*;

public class SortDescending {
    //Bubble sort
    public static void bubbleSortDescending(int a[]){
        int n = a.length;

        for(int turn = 0; turn < n - 1; turn++){
            for(int i = 1; i < n - turn; i++){
                if(a[i - 1] < a[i]){
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.print("Bubble sorted Array:    ");
        printArr(a);
    }

    //Selection sort
    public static void selectionSortDescending(int a[]){
        for(int i = 0; i < a.length - 1; i++){
            int minPos = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[minPos] < a[j]){
                    minPos = j;
                }
            }

            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
        System.out.print("Selection sorted Array: ");
        printArr(a);
    }

    //Insertion sort
    public static void insertionSortDescending(int a[]){
        for(int i = 1; i < a.length; i++){
            int curr = a[i];
            int prev = i - 1;

            //Find the correct position
            while(prev >= 0 && a[prev] < curr){
                a[prev + 1] = a[prev];
                prev--;
            }
            //Insertion
            a[prev + 1] = curr;
        }
        System.out.print("Insertion sorted Array: ");
        printArr(a);
    }

    //Counting sort
    public static void countingSortDescending(int a[]){
        //Find range of frequency array
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            largest = Math.max(largest, a[i]);
        }

        //Formulate the frequency array
        int count[] = new int[largest + 1];
        for(int i = 0; i < a.length; i++){
            count[a[i]]++;
        }

        //Making the final sorted array
        int j = 0;
        for(int i = count.length - 1; i >= 0; i--){
            while(count[i] > 0){
                a[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.print("Counting sorted Array:  ");
        printArr(a);
    }

    public static void printArr(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int a[] = {3,6,2,1,8,7,4,5,3,1};
        System.out.print("Original Array:         ");
        printArr(a);
        bubbleSortDescending(a);
        selectionSortDescending(a);
        insertionSortDescending(a);
        countingSortDescending(a);
    }
}
