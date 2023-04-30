import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        System.out.println("Enter values of the matrix :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        print2DArray(matrix);
        System.out.print("Enter key, to be Searched :- ");
        int key = sc.nextInt();
        searchKey(matrix, key); 
    }

    public static void searchKey(int [][]matrix, int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    System.out.print("Searched key found at : ("+i+", "+j+")"); 
                    return;
                }
            }
        }
        System.out.println("Searched key not found");
    }

    public static void print2DArray(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
