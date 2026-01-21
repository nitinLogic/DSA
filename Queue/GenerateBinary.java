//This code generates & prints all binary numbers from 1 to n
import java.util.*;

public class GenerateBinary {
    public static void generateBin(int n){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);

        while(n > 0){
            int curr = q.remove();
            q.add(curr * 10);
            q.add((curr * 10) + 1);
            
            System.out.print(curr + " ");
            n--;
        }
    }

    public static void main(String args[]){
        int n = 5;
        generateBin(n);
    }
}
