//This code finds the element that appears more than floor(n/2) times in an array
import java.util.*;

public class MajorityElement {
    public static int majorityEleBrute(int a[]){
        int MajorityCount = a.length / 2;

        for(int i = 0; i < a.length; i++){
            int count = 0;
            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }

            if(count >= MajorityCount){
                return a[i];
            }
        }

        return -1;  //No majority element

    }

    public static int majorCount(int a[], int num, int si, int ei){
        int count = 0;
        
        for(int i = si; i <= ei; i++){
            if(a[i] == num)
                count++;
        }
        
        return count;
    }

    public static int majorityIdx(int a[], int si, int ei){
        //Base case
        if(si >= ei){
            return ei;
        }

        int mid = si + (ei - si) / 2;
        int left = majorityIdx(a, si, mid);
        int right = majorityIdx(a, mid + 1, ei);

        if(a[left] == a[right]){
            return left;
        }

        int leftCount = majorCount(a, a[left], si, ei);
        int rightCount = majorCount(a, a[right], si, ei);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityEle(int a[]){
        return a[majorityIdx(a, 0, a.length - 1)];
    }

    public static void main(String args[]){
        int a[] = {2,2,1,1,1,2,2};
        System.out.println(majorityEleBrute(a));
        System.out.println(majorityEle(a));
    }
}
