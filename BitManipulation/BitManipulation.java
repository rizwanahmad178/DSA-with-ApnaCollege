package BitManipulation;

public class BitManipulation {
    public static void main(String[] args) {
        // Binary AND &
        // System.out.println(5 & 6);
        // Binary OR |
        // System.out.println(5 | 6);
        // Binary XOR ^
        // System.out.println(5 ^ 6);
        // Binary One's Complement
        // System.out.println(~5);
        // System.out.println(~0);
        // Binary Left Shift
        // System.out.println(5 << 2);//a<<b = a * 2^b
        // Binary Right Shift
        // System.out.println(16 >> 2);//a>>b = a /
        // checkOddEven(5);
        // System.out.println("3rd bit for the given number is : "+getIthBit(10,3));
        // System.out.println("2nd bit for the given number is changed :
        // "+setIthBit(10,2));
        // System.out.println("After clearing 2nd bit number is : "+clearIthBit(10,1));
        // updateIthBit(10,2,1);
        // clearIbits(15, 2);
        // clearBitsInRange(10,2,4);
        System.out.println("Is the given number is power of 2 or not : " + isPowerOfTwo(16));
        System.out.println("Number of set bits in the given number is : " + countSetBits(15));
        System.out.println("Fast Exponentiaion of 3^5 : " + fastExpo(3, 5));
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while(n>0){
            if((n&1)!=0){//if LSB is 1 then will use ans = ans * a otherwise ans = ans * 1 = ans
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;

    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void clearIbits(int n, int i) {
        int bitMask = (~0) << i;
        System.out.println(n & bitMask);
    }

    public static void clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        System.out.println(n & bitMask);
    }

    public static void updateIthBit(int n, int i, int newBit) {
        // if(newBit==0){
        // clearIthBit(n, i);
        // }else{
        // setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        System.out.println(n | bitMask);
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void checkOddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
