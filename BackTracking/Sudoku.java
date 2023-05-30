package BackTracking;

public class Sudoku {
    public static void main(String[] args) {
        int grid[][] = {  {7, 0, 0, 0, 0, 0, 2, 0, 0},   
          {4, 0, 2, 0, 0, 0, 0, 0, 3},   
          {0, 0, 0, 2, 0, 1, 0, 0, 0},   
          {3, 0, 0, 1, 8, 0, 0, 9, 7},   
          {0, 0, 9, 0, 7, 0, 6, 0, 0},   
          {6, 5, 0, 0, 3, 2, 0, 0, 1},   
          {0, 0, 0, 4, 0, 9, 0, 0, 0},   
          {5, 0, 0, 0, 0, 0, 1, 0, 6},   
          {0, 0, 6, 0, 0, 0, 0, 0, 8}   
       };
       if(sudokuSolver(grid, 0, 0)){
        System.out.println("Solution Exists>>>");
        printSudoku(grid);
       }else{
        System.out.println("Solution doesn't exist>>>");
       }
    }

    public static void printSudoku(int[][] grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean sudokuSolver(int[][] grid, int row, int col){
        //base case
        if(row==9){
            return true;
        }
        //recursion
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(grid[row][col] != 0){
            return sudokuSolver(grid, nextRow, nextCol);
        }

        for(int digit=1; digit<=9;digit++){
            if(isSafe(grid, row, col, digit)){
                grid[row][col] = digit;
                if(sudokuSolver(grid, nextRow, nextCol)){
                    return true;
                }
                grid[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] grid, int row, int col, int digit){
        //column
        for(int i=0;i<=8;i++){
            if(grid[i][col] == digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(grid[row][j] == digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(grid[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
}
