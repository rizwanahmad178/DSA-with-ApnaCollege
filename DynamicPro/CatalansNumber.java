package DynamicPro;

import java.util.Arrays;

public class CatalansNumber {
    public static int catalansNumberWithRecursion(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans = 0;
        for(int i=0;i<=n-1;i++){
            ans += catalansNumberWithRecursion(i) * catalansNumberWithRecursion(n-i-1);
        }
        return ans;
    }
    public static int catalansMem(int n, int[] dp){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += catalansMem(i, dp) * catalansMem(n-i-1, dp);
        }
        return dp[n] = ans;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Catalan's Value of number "+n+" : " +catalansNumberWithRecursion(n));
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println("Catalan's Value of number "+n+" : " +catalansMem(n,dp));
    }
}
