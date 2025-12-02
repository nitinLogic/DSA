//This code computes Inversion count of an array
import java.util.*;

public class InversionCount {
    public static int inversionCntBrute(int a[]){
        int count = 0;

        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j] && i < j)
                    count++;
            }
        }

        return count;
    }

    public static int merge(int a[], int si, int mid, int ei){
        int invCount = 0;

        int i = si;
        int j = mid + 1;
        int k = 0;

        int temp[] = new int[ei - si + 1];

        while(i <= mid && j <= ei){
            if(a[i] <= a[j]){
                temp[k++] = a[i++];
            }
            else{
                temp[k++] = a[j++];
                invCount += mid - i + 1;
            }
        }

        while(i <= mid){
            temp[k++] = a[i++];
        }

        while(j <= ei){
            temp[k++] = a[j++];
        }

        for(i = si, k = 0; i <= ei; i++, k++){
            a[i] = temp[k];
        }

        return invCount;
    }

    public static int inversionCnt(int a[], int si, int ei){
        int invCount = 0;
        
        if(si < ei){

            int mid = si + (ei - si) / 2;

            invCount += inversionCnt(a, si, mid);
            invCount += inversionCnt(a, mid + 1, ei);
            invCount += merge(a, si, mid, ei);
        }

        return invCount;
    }

    public static void main(String args[]){
        int a[] = {2,4,1,3,5};
        System.out.println(inversionCntBrute(a));
        System.out.println(inversionCnt(a, 0, a.length - 1));
    }
}
