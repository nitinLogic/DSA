//This code prints Floyd's Triangle pattern
import java.util.*;

public class FloydTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter length of pattern: ");  //Input pyramid length from user
        int n = sc.nextInt();
        int count = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(count < 10)
                    System.out.print(" " + count + " ");  //Space before digit to accomodate
                else
                    System.out.print(count + " ");
                
                count++;
            }
            System.out.println();
        }
    }
}
