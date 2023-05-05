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

        //Palindrome
        // String str = "racecar";
        // if(isPalindrome(str)){
        //     System.out.println("Given String is Palindrome!");
        // }else{
        //     System.out.println("Given String is not Palindrome");
        // }

        //Shortest Path
        // String path = "WNEENESENNN";
        // System.out.print("Shortest Path : "+getShortestPath(path));

        //Largest String
        // String fruits[] = {"Apple","Orange","Grapes"};
        // System.out.print("Largest String of the given String Array : "+largestString(fruits));

        //ConvertToUppercase
        // String str = "hi, i am rizwan!";
        // System.out.print("After converting to Uppercase : "+convertToUpperCase(str));

        //String Compression
        String str = "aaabbbbbcdddd";
        System.out.print("Compressed String is : "+compressedString(str));
    }

    public static String compressedString(String str){
        //With String
        // String newStr = "";
        // for(int i=0;i<str.length();i++){
        //     Integer count = 0;
        //     while(i<(str.length()-1) && str.charAt(i)==str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     newStr += str.charAt(i);
        //     if(count>1){
        //         newStr += count.toString();
        //     }
        // }
        // return newStr;

        //With StringBuilder
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count = 0;
            while(i<(str.length()-1) && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static String convertToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String largestString(String[] fruits){
        String largest = "";
        largest = fruits[0];
        //str1.compareTo(str2)
        //if result is = 0 then str1=str2
        //if result is > 0 then str1>str2
        //if result is < 0 then str1<str2
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        return largest;
    }

    public static double getShortestPath(String path){
        double sPath = 0;
        double x = 0, y = 0;
        for(int i=0;i<path.length();i++){
            char ch = path.charAt(i);
            if(ch=='N'){
                y++;
            }else if(ch=='S'){
                y--;
            }else if(ch=='E'){
                x++;
            }else{
                x--;
            }
        }
        double x2 = x*x;
        double y2 = y*y;
        sPath = Math.sqrt(x2+y2); 
        return sPath;
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
