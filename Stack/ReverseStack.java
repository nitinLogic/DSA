//This code reverses a stack using constant space
import java.util.*;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> st, int n){
        if(st.isEmpty()){
            st.push(n);
            return;
        }

        int top = st.pop();
        pushAtBottom(st, n);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty())
            return;

        int top = st.pop();
        reverseStack(st);
        pushAtBottom(st, top);
    }
    public static void printStack(Stack<Integer> st){
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }

    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        reverseStack(st);
        printStack(st);
    }
}
