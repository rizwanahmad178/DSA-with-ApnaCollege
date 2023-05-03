package Strings;

public class StringClass {
    public static void main(String[] args) {
        //String Creation
        // String str1 = "rizwan";
        // String str2 = new String("rizwan");
        // System.out.println(str1);
        // System.out.println(str2);
        // if(str1==str2){
        //     System.out.println("Both Strings are same");
        // }else{
        //     System.out.println("Both Strings are not same");
        // }
        String str = "racecar";
        if(isPalindrome(str)){
            System.out.println("Given String is Palindrome!");
        }else{
            System.out.println("Given String is not Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
