import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int matrix[][] = new int[3][3];
        // int n = matrix.length, m = matrix[0].length;
        // System.out.println("Enter values of the matrix :- ");
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // print2DArray(matrix);
        // System.out.print("Enter key, to be Searched :- ");
        // int key = sc.nextInt();
        // searchKey(matrix, key); 
        int matrix[][]= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiralMatrix(matrix);
    }

    public static void printSpiralMatrix(int [][]matrix){
        int n = matrix.length, m = matrix[0].length;
        int stRow = 0, stCol = 0, enRow = n-1, enCol = m-1;
        while(stRow<=enRow && stCol<=enCol){
            //top
            for(int j=stCol;j<=enCol;j++){
                System.out.print(matrix[stRow][j]+" ");
            }
            //right
            for(int i=stRow+1;i<=enRow;i++){
                System.out.print(matrix[i][enCol]+" ");
            }
            //bottom
            for(int j=enCol-1;j>=stCol;j--){
                if(stRow==enRow){
                    break;
                }
                System.out.print(matrix[enRow][j]+" ");
            }
            //left
            for(int i=enRow-1;i>=stRow+1;i--){
                if(stCol==enCol){
                    break;
                }
                System.out.print(matrix[i][stCol]+" ");
            }
            stRow++;
            stCol++;
            enRow--;
            enCol--;
        }
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