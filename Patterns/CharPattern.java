//This program prints character pattern
import java.util.*;

public class CharPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter length of pattern: ");  //Input pattern length from user
        int n = sc.nextInt();
        char c = 'A';

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(c++);
            }
            System.out.println();
        }
    }
}
