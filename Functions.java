import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Functions {
    public static void main(String[] args) {
        //int n = 11;
        // System.out.println(findFact(n));
        //butterfly(n);
        //System.out.println(binCoefficient(5,2));
        //System.out.println(isPrime(n));
        //primeInRange(n);
        //binToDec(n);
        //decToBin(n);
        //Assignments
        //Question 1 
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter First Number : ");
        // double a = sc.nextInt();
        // System.out.print("Enter Second Number : ");
        // double b = sc.nextInt();
        // System.out.print("Enter Third Number : ");
        // double c = sc.nextInt();
        // System.out.print("Average of three numbers : "+ average(a,b,c));

        //Question 2
        // int num = sc.nextInt();
        // if(isEven(num)){
        //     System.out.println("Number is Even");
        // }else{
        //     System.out.println("Number is Odd");
        // }

        //Question 3
        // int num = sc.nextInt();
        // if(isPalindrome(num)){
        //     System.out.println("Number "+num+ " is Palindrome");
        // }else{
        //     System.out.println("Number "+num+ " is not a Palindrome");
        // }

        //Question 4
        //usesOfMathMethods();

        //Question 5
        // int n = sc.nextInt();
        // System.out.print("Sum of digits : "+findSum(n));
    }
    public static int findSum(int num){
        int sum = 0;
        while(num>0){
            int rem = num % 10;
            sum += rem;
            num/=10;
        }
        return sum;
    }
    public static void usesOfMathMethods(){
        int a = 3, b = 5, c = 8, d = 9;
        System.out.print("Max of a & b is : "+Math.max(a,b)+"\n");
        System.out.print("Max of c & d is : "+Math.min(c,d)+"\n");
        System.out.print("Square root of c is : "+Math.sqrt(c)+"\n");
        System.out.print("Square of b is : "+Math.pow(5,2)+"\n");
        IntStream stream = IntStream.of(a,b,c,d);
        OptionalDouble obj = stream.average();
        if (obj.isPresent()) {
            System.out.println("Average of a, b, c & d is : "+obj.getAsDouble()+"\n");
        }
        else {
            System.out.println("Not Available");
        }
        System.out.print("Absolute value of -a is : "+Math.abs(-a)+"\n");
    }
    public static boolean isPalindrome(int num){
        int n = num;
        int rev = 0;
        while(n>0){
            int rem = n % 10;
            rev = rev*10 + rem;
            n/=10;
        }
        if(num == rev){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static double average(double a, double b, double c){
        return (a+b+c)/3;
    }
    public static void decToBin(int decNum){
        int num = decNum;
        int bin = 0;
        int pow = 0;
        while(decNum>0){
            int rem = decNum % 2 ;
            bin = bin + (rem*(int)Math.pow(10, pow));
            pow++;
            decNum/=2;
        }
        System.out.println(bin);
    }
    public static void binToDec(int binNum){
        int decNum = 0;
        int pow = 0;
        int myNum = binNum;
        while(binNum>0){
            int ldigit = binNum % 10;
            decNum = decNum + (ldigit * (int) Math.pow(2,pow));
            pow++;
            binNum/=10;
        }
        System.out.println(myNum);

    }

    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    } 



    public static int binCoefficient(int n, int r){
        int factN = findFact(n);
        int factR = findFact(r);
        int factnmr = findFact(n-r);

        int coeff = factN / (factR * factnmr);

        return coeff;
    }

    public static void butterfly(int n){
        //first half
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //second half
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static int findFact(int n) {
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
}
