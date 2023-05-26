package BackTracking;

public class BackTracking {

    static int count = 0;
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr,0,1);
        // printArr(arr);

        //find subset and print them
        // String str = "abc";
        // findSubset(str, "", 0);

        //find permutations
        // String str = "abcd";
        // findPermutations(str, "");
        
        //nQueens Problem
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("Solution is Possible::");
            printBoard(board);
        }else{
            System.out.println("Solution is not Possibl::");
        }
        //System.out.println("Total ways to solve nQueens : "+count);
    }

    // public static void nQueens(char[][] board, int row){
        public static boolean nQueens(char[][] board, int row){
        //base case
        if(row==board.length){
            //printBoard(board);
            //count++;
            //return;
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)==1){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }

    public static int isSafe(char[][] board, int row, int col){
        //vertical check
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return 0;
            }
        }
        //dia left check
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return 0;
            }
        }
        //dia right check
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return 0;
            }
        }
        return 1;
    }

    public static void printBoard(char[][] board){
        System.out.println("New Board...");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void findPermutations(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(newStr, ans+curr);     
        }
    }

    public static void findSubset(String str, String ans, int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);
        //no choice
        findSubset(str, ans, i+1);
    }

    public static void printArr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void changeArr(int[] arr, int i, int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] -=2;//backtracking
    }
}
