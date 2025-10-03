//This code prints a square pattern of stars
import java.util.*;

public class Square_Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int side = sc.nextInt();

        for(int i = 0;i < side; i++){
            for(int j = 0;j < side; j++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
