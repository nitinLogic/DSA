//This code finds index of target in a sorted rotated array
import java.util.*;

public class SortedRotated {
    public static int searchSortedRotated(int a[], int tar, int si, int ei){
        //Base case
        if(si > ei){
            return -1;
        }

        int mid = si + (ei - si) / 2;

        //Found
        if(tar == a[mid]){
            return mid;
        }
        //mid on L1
        else if(a[si] <= a[mid]){
            //Case a
            if(a[si] <= tar && tar <= a[mid]){
                return searchSortedRotated(a, tar, si, mid - 1);
            }
            //Case b
            else{
                return searchSortedRotated(a, tar, mid + 1, ei);
            }
        }
        //mid on L2
        else{
            //Case c
            if(a[mid] <= tar && tar <= a[ei]){
                return searchSortedRotated(a, tar, mid + 1, ei);
            }
            //Case d
            else{
                return searchSortedRotated(a, tar, si, mid - 1);
            }
        }
    }

    public static void main(String args[]){
        int a[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 0;
        System.out.println(searchSortedRotated(a, tar, 0, a.length - 1));
    }
}
