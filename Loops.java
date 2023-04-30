import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num == 2){
            System.out.println(num + " is Prime");
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0)
                    isPrime=false;
            }
            if(isPrime==true){
                System.out.println(num + " is Prime");
            }else{
                System.out.println(num + " is not a Prime");
            }
        }

        
        // int num = sc.nextInt();
        // int rev = 0;
        // while(num>0){
        //     int rem = num%10;
        //     num/=10;
        //     rev = rev*10 + rem;
        // }
        // System.out.println(rev);


        // int num = sc.nextInt();
        // int sum = 0;
        // int count = 1;
        // while(count<=num){
        //     sum = sum + count;
        //     count++;
        // }
        // System.out.println(sum);
        
        // int count = 1;
        // while(count<=10){
        //     System.out.println("This is line number : "+count++);
        // }
    }
}
