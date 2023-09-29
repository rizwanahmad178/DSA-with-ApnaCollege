package DynamicPro;

public class LongestCommonSub {
    public static int lcsRecursion(String str1, String str2, int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return lcsRecursion(str1, str2, n-1, m-1) + 1;
        }else{
            int ans1 = lcsRecursion(str1, str2, n-1, m);
            int ans2 = lcsRecursion(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }
    public static int lcsMemoization(String str1, String str2, int n, int m, int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return dp[n][m] = lcsMemoization(str1, str2, n-1, m-1, dp) + 1;
        }else{
            int ans1 = lcsMemoization(str1, str2, n-1, m, dp);
            int ans2 = lcsMemoization(str1, str2, n, m-1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        int n = str1.length();
        int m = str2.length();
        System.out.println("LongestCommonSubsequence : "+lcsRecursion(str1, str2, n, m));
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println("LongestCommonSubsequence : "+lcsMemoization(str1, str2, n, m, dp));
    }
}
