//This code checks if a linked list is palindrome
// using stack data structure
import java.util.*;

public class PalindromeLL {
    public static boolean checkPalindrome(LinkedList<Character> ll){
        Stack<Character> s = new Stack<>();

        Iterator<Character> itr = ll.iterator();        //custom iterator
        while(itr.hasNext()){
            Character ch = itr.next();
            s.push(ch);
        }
        
        itr = ll.iterator();
        while(!s.isEmpty()){
            if(s.pop() != itr.next()){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        LinkedList<Character> ll = new LinkedList<>();

        ll.addLast('A');
        ll.addLast('B');
        ll.addLast('C');
        ll.addLast('B');
        ll.addLast('A');

        System.out.println(checkPalindrome(ll));
    }
}
