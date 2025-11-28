//This code prints steps to move all n disks from first tower to last tower
import java.util.*;

public class TowerOfHanoi {
    static int steps = 0;
    public static void diskSteps(int n, String src, String help, String dest){
        //Base case
        if(n == 1){
            System.out.println("Step " + ++steps + ": Move disk " + n + " from tower " + src + " to tower " + dest);
            return;
        }

        //Move n-1 disks from source to helper using destination
        diskSteps(n - 1, src, dest, help);

        //Move nth disk from source to destination
        System.out.println("Step " + ++steps + ": Move disk " + n + " from tower " + src + " to tower " + dest);
        
        //Move earlier n-1 disks from helper to destination using source
        diskSteps(n - 1, help, src, dest);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        diskSteps(n, "A", "B", "C");
        System.out.println("Total steps: " + steps);
    }
}