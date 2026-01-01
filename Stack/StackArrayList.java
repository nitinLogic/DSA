//This code implements stack using arraylist
import java.util.*;

public class StackArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
            return;
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return val;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
    public static void main(String args[]){
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
