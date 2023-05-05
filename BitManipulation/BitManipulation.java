package BitManipulation;

public class BitManipulation {
    public static void main(String[] args) {
        //Binary AND &
        //System.out.println(5 & 6);
        //Binary OR |
        //System.out.println(5 | 6);
        //Binary XOR ^
        //System.out.println(5 ^ 6);
        //Binary One's Complement
        //System.out.println(~5);
        //System.out.println(~0);
        //Binary Left Shift
        //System.out.println(5 << 2);//a<<b = a * 2^b
        //Binary Right Shift
        //System.out.println(16 >> 2);//a>>b = a / 
        //checkOddEven(5);
        System.out.println("3rd bit for the given number is : "+getIthBit(10,3));
        System.out.println("2nd bit for the given number is changed : "+setIthBit(10,2));
        System.out.println("After clearing 2nd bit number is : "+clearIthBit(10,1));
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static void checkOddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
