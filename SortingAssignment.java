public class SortingAssignment {
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,2};
        //Sorting in Descending Order
        
        //Bubble Sort
        //bubbleSort(arr);

        //Selection Sort
        //selectionSort(arr);

        //Insertion Sort
        //insertionSort(arr);

        //Counting Sort
        //countingSort(arr);
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
        int k = 0 ;
        for(int i=freq.length-1;i>=0;i--){
            while(freq[i]>0){
                arr[k] = i;
                k++;
                freq[i]--;
            }
        }
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        printArray(arr);
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int maxPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxPos]<arr[j]){
                    maxPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
        printArray(arr);
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
