import java.time.chrono.HijrahEra;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.LogManager;

public class Assignment4 {
    public static void main(String[] args) {
        // Arrays Assignment
        // Question 1
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int nums[] = new int[n];
        // for(int i=0;i<n;i++){
        // nums[i] = sc.nextInt();
        // }
        // System.out.println(question1(nums));

        // Question 2
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int nums[] = new int[n];
        // for (int i = 0; i < n; i++) {
        //     nums[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();
        // System.out.println(question2(nums, target));

        //Question 3
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int prices[] = new int[n];
        // for (int i = 0; i < n; i++) {
        //     prices[i] = sc.nextInt();
        // }
        // System.out.print("Max Profit : "+findMaxProfit(prices));

        //Question 4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Area tapped with water : "+findTappedWater(arr));

    }

    public static int findTappedWater(int []arr){
        int res = 0, l=0, r=arr.length-1;
        int rMax = arr[r] , lMax = arr[l];
        while(l<r){
            if(lMax<rMax){
                l++;
                lMax = Math.max(lMax,arr[l]);
                res += lMax - arr[l];
            }else{
                r--;
                rMax = Math.max(rMax,arr[r]);
                rMax += rMax - arr[r];
            }
        }
        return res;
    }

    public static int findMaxProfit(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            int profit = 0;
            if(buyPrice<prices[i]){
                profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static int question2(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
            }
        }
        return index;
    }

    public static boolean question1(int[] nums) {
        // Approach 1
        // for(int i=0;i<nums.length;i++){
        // for(int j=i+1;j<nums.length;j++){
        // if(nums[i]==nums[j]){
        // return true;
        // }
        // }
        // }
        // return false;

        // Approach 2
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
