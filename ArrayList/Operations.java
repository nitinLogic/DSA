package ArrayList;
//This code shows the use of operations used in arraylist
import java.util.*;

public class Operations {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        
        //Add Operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1, 9);
        System.out.println(list);


        //Get Operation - O(1)
        int element = list.get(2);
        System.out.println(element);

        //Remove Opeartion - O(n)
        list.remove(2);
        System.out.println(list);

        //Set - O(n)
        list.set(2, 10);
        System.out.println(list);

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //Size
        System.out.println(list.size());
    }
}
