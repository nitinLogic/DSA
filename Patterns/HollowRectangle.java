//This program prints a hollow rectangle
import java.util.*;

public class HollowRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter length of pattern: ");  //Input pattern length
        int n = sc.nextInt();

        System.out.print("Enter breadth of pattern: ");  //Input pattern breadth
        int m = sc.nextInt();
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                
                if(i == 1 || i == m)    //Print first and last line
                    System.out.print("* ");
                else{           //Print rest lines

                    if(j == 1 || j == n)
                        System.out.print("* ");
                    else
                        System.out.print("  ");

                }

            }
            System.out.print("\n");
        }
    }
}
