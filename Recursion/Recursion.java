package Recursion;

import javax.swing.text.html.StyleSheet;

class Recursion{
    public static void main(String[] args) {
        int n = 8;
        // int arr[] = {1,12,3,9,17,25,33,41};
        int arr[] = {8,3,6,9,5,10,2,5,3};
        //printDec(n);
        //printInc(n);
        //System.out.println(printFact(n));
        //System.out.println(sumOfN(n));
        //System.out.println("Nth Fibonacci term is : "+fib(n));
        //System.out.println("Given Array is Sorted ? : "+isSorted(arr,0));
        //System.out.println(firstOccurance(arr, 5, 0));
        //System.out.println(lastOccurance(arr, 10, 0));
        System.out.println("Print x^n where x = 2 & n = 10 : "+power(2,5));
        System.out.println("Print x^n where x = 2 & n = 10(Optimized) : "+optimizedPower(2,5));
    }

    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPS = halfPower * halfPower;
        //if n is odd
        if(n%2 != 0 ){
            halfPS = halfPS * a;
        }
        return halfPS;
    }

    public static int power(int x, int n){
        //base case
        if(n==0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }

    public static int lastOccurance(int[] arr, int key, int i){
        //base case
        if(i==arr.length-1){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }
        if(arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int firstOccurance(int[] arr, int key, int i){
        //base case
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);

    }

    public static boolean isSorted(int[] arr, int i){
        //base case
        if(i==(arr.length-1)){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int fib(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static int sumOfN(int n){
        //base case
        if(n==1){
            return 1;
        }
        int snm1 = sumOfN(n-1);
        int sn = n + snm1;
        return sn;
    }

    public static int printFact(int n){
        //base case
        if(n==0){
            return 1;
        }
        int fnm1 = printFact(n-1);
        int fn = n * fnm1;
        return fn;
    }

    public static void printInc(int n){
        //base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n - 1);
        System.out.print(n+" ");
        
    }
    public static void printDec(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
}