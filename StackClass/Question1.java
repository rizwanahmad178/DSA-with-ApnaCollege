package StackClass;

import java.util.Stack;

public class Question1 {
    public static void main(String[] args) {
            //push at the bottom
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);

            pushAtBottom(st, 5);
            while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
    public static void pushAtBottom(Stack<Integer> st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }

}
