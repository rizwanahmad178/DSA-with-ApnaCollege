public class Assignment2DArray {
    public static void main(String[] args) {
        //Question 1
        // int[][] arr = { {4,7,8},{8,8,7} };
        // int key = 7;
        // System.out.print("Number of 7s in the given Array : "+countNumber(arr,key));

        //Question 2
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // secondRowSum(nums);

        //Question 3 Transpose
        int[][] arr = {{1,2,3},
                       {4,5,6}};
        transposeMat(arr);
    }

    public static void transposeMat(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int [][]transposeMatrix = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transposeMatrix[j][i] = arr[i][j];
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transposeMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void secondRowSum(int [][]nums){
        int sum =0;
        for(int i=0;i<nums[0].length;i++){
            sum += nums[1][i];
        }
        System.out.print("Sum of second Row : "+sum);
    }

    public static int countNumber(int[][] arr, int key){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(key == arr[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
}
