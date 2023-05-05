package Strings;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class StringAssignment {
    public static void main(String[] args) {
        // Question 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter String:-");
        // String str = sc.nextLine();
        // System.out.print("Number of vowels in the String : "+countVowel(str));

        // Question 2
        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));
        // Output - false true

        // Question 3
        // String str="ApnaCollege".replace("l","");
        // System.out.println(str);
        // Output - ApnaCoege

        // Question 4
        // String str1 = "race";
        // String str2 = "care";
        // if(isAnagram(str1,str2)){
        // System.out.println("Given Strings are Anagrams of each other");
        // }else{
        // System.out.println("Not Anagrams");
        // }

        // Question 5
        // intern() method - String Interning is a method of storing only one copy of
        // each distinct String Value, which must be immutable.
        // By applying String.intern() on a couple of strings will ensure that all
        // strings having the same contents share the same memory. For example, if a
        // name ‘Amy’ appears 100 times, by interning you ensure only one ‘Amy’ is
        // actually allocated memory.
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char str1a[] = str1.toCharArray();
            char str2a[] = str2.toCharArray();
            Arrays.sort(str1a);
            Arrays.sort(str2a);
            boolean res = Arrays.equals(str1a, str2a);
            if (res) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int countVowel(String str) {
        int count = 0;
        String str1 = str.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

}
