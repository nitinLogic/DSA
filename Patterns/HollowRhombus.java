//This code prints a Hollow Rhombus pattern
import java.util.*;

public class HollowRhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter length of rhombus: ");  //Input side of rhombus from user
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //Print spaces before pattern in ith line
            for(int j = 1; j <= (n - i); j++)
                System.out.print(" ");
            
            //Print the pattern for ith line
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n)    //Print only stars in 1st and nth row
                    System.out.print("* ");
                else{           

                    if(j == 1 || j == n)    //Print star for 1st & nth column
                        System.out.print("* ");
                    else                    //Print space otherwise
                        System.out.print("  ");

                }
            }

            System.out.println();
        }
    }
}
