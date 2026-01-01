//This code pushes at the bottom of the stack using recursion
import java.util.*;

public class PushBottom {
    public static void pushBottomofStack(Stack<Integer> st, int n){
        //Base case
        if(st.isEmpty()){
            st.push(n);
            return;
        }

        int val = st.pop();
        pushBottomofStack(st, n);
        st.push(val);
    }

    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        pushBottomofStack(st, 5);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
