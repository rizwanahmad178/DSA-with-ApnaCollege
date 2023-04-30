public class Arrays2 {
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        //Linear Search
        // int key = 8;
        // int index = linearSearch(arr,key);
        // if(index == -1){
        //     System.out.println("Key not Found");
        // }else{
        //     System.out.print("Key found at index : "+index);
        // }

        //Largest Element
        //System.out.print("Largest Element is : "+findLargest(arr));

        //Binary Search
        // int key = 7;
        // int index = bindarySearch(arr,key);
        // if(index==-1){
        //     System.out.println("Key not Found");
        // }else{
        //     System.out.print("Key found at index : "+index);
        // }

        //Reverse of an Array
        //printRevreseArray(arr);

        //Pairs in Array
        //printPairs(arr);
        
        //Print Subarray
        //printSubArray(arr);
        
        //MaxSum of Subarray
        //maxSumSubarray(arr);

        //Kadane's Algorithm
        //kadanes(arr);

        //Trapping Rainwater
        //findTrappedArea(arr);

        //Buy&SellStock
        int days[] = {7,1,5,3,6,4};
        System.out.print("Max Prfit is : "+findMaxProfit(days));
        
    }
    public static int findMaxProfit(int[] days){
        int maxProfit = 0;
        int n = days.length;
        int profit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sellPrice = days[i];
            if(buyPrice<sellPrice){
                profit = sellPrice - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = sellPrice;
            }
        }
        return maxProfit;
    }
    public static void findTrappedArea(int arr[]){
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        int trappedWater = 0;
        for(int i=0;i<arr.length;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }
        System.out.print("Trapped area with water : "+trappedWater);
    }
    public static void kadanes(int[] arr){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            if(ms < cs){
                ms = cs;
            }
        }
        System.out.print("MaxSum of the Subbaraay : "+ms);
    }
    public static void maxSumSubarray(int []arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                currSum = start==0? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum<currSum){
                    maxSum = currSum;
                }   
            }
        }
        System.out.print("MaxSum of subarray "+currSum);
    }
    public static void printSubArray(int []arr){
        int totalCount = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int sum = 0;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                if(maxSum<sum){
                    maxSum = sum;
                }
                totalCount++;
                System.out.print("\nSum of subarray "+sum+"\n");
            }
            System.out.println();
        }
        System.out.print("Max Sum of all subarray : "+maxSum);
        System.out.print("\nNumber of total subarray : "+totalCount);
    }
    public static void printPairs(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.print("Total number of pairs :- "+count);
    }
    public static void printRevreseArray(int[] arr){
        System.out.println("Before Reversing array :-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println("\nAfter Reversing array :-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int bindarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static int findLargest(int[] arr){
        int lar = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar = arr[i];
            }
        }
        return lar;
    }
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
