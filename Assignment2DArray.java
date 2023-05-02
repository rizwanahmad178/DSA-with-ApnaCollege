public class Assignment2DArray {
    public static void main(String[] args) {
        //Question 1
        int[][] arr = { {4,7,8},{8,8,7} };
        int key = 7;
        System.out.print("Number of 7s in the given Array : "+countNumber(arr,key));
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
