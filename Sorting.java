import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 5, 8, 6, 3, 1 };
        // Arrays.sort(arr, 0, 4);
        // printArray(arr);
        // Integer arr2[] = { 4, 2, 5, 8, 6, 3, 1 };
        // Arrays.sort(arr2, Collections.reverseOrder());
        // printArray2(arr2);
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
    }

    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int[] freq = new int[largest+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
        printArray(arr);
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void printArray2(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
