package StackClass;

import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {
        //reverse a string using stack
        String str = "abc";
        String res = reverseString(str);
        System.out.println(res);
    }
    public static String reverseString(String str){
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            st.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!st.isEmpty()){
            char curr = st.pop();
            result.append(curr);
        }
        return result.toString();
    }
}
