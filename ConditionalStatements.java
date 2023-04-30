import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 400) == 0) && ((year % 100) == 0);

        if(x && (y||z)){
            System.out.println("Given year is leap year");
        }else{
            System.out.println("Given year ia not a leap year");
        }

        // int num = sc.nextInt();
        // String type = (num%2==0)? "even" : "odd";
        // System.out.println(type);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if(a>=b && a>=c){
        //     System.out.println(a);
        // }
        // else if(b>=c){
        //     System.out.println(b);
        // }else{
        //     System.err.println(c);
        // }
    }
}
