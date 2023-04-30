import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //PALINDROMIC Pattern with Numbers pattern
        //         1
        //       2 1 2
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5
        int st = 1;
        
        for(int i=0;i<n;i++){
            int x = i+1;
            int flag = 1;
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=0;j<st;j++){
                if(x==1){
                    System.out.print(x+" ");
                    x++;
                    flag=0;
                }else if(x>1 && flag==1){
                    System.out.print(x+" ");
                    x--;
                }else if(x>1 && flag==0){
                    System.out.print(x+" ");
                    x++;
                }
            }
            st+=2;
            System.out.println();
        }
        
        
        
        //NUMBER PYRAMID pattern
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<i+1;j++){
        //         System.out.print(i+1+" ");
        //     }
        //     System.out.println();
        // }
        
        

        //Diamond Pattern
        //      *
        //    * * *
        //  * * * * *
        //* * * * * * *
        //  * * * * *
        //    * * *
        //      *
        // int st = 1;
        // int sp = n-1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<sp;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<st;j++){
        //         System.out.print("* ");
        //     }
        //     st+=2;
        //     sp--;
        //     System.out.println();
        // }
        // for(int i=0;i<n;i++){
        //     st-=2;
        //     sp++;
        //     for(int j=0;j<sp;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<st;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        
        
        //HOLLOW RHOMBUS pattern
        //         * * * * *
        //       *       *
        //     *       *
        //   *       *
        // * * * * *
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n-1;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<n;j++){
        //         if(i==0 || i==n-1){    
        //             System.out.print("* ");
        //         }else if(j==0 || j==n-1){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }



        //SOLID RHOMBUS pattern
        //         * * * * *
        //       * * * * *
        //     * * * * *
        //   * * * * *
        // * * * * * 
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n-1;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        
        //Butterfly Pattern
        // *             *
        // * *         * *
        // * * *     * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *
        // int sp = 2*n - 2;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=0;j<sp;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     sp-=2;
        // }
        // for(int i=0;i<n;i++){
        //     sp+=2;
        //     for(int j=i;j<n;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=0;j<sp;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=i;j<n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
            
        // }
       
        
        
        
        //0-1 Triangle Pattern
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i+1;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
                
        //     }
        //     System.out.println();
        // }




        //Floyd's Triangle Pattern
        // int val = 1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i+1;j++){
        //         System.out.print(val++ +"  ");
        //     }
        //     System.out.println();
        // }

        
        
        // Inverted half pyramid with numbers
        // for (int line = 0; line < n; line++) {
        //     for (int val = 1; val < n -line + 1; val++) {
        //         System.out.print((val)+" ");
        //     }
        //     System.out.println();
        // }

        // Inverted & rotated half pyramid
        // *
        // * *
        // * * *
        // * * * *
        // for(int line = 0; line<n; line++){
        // for(int val = line+1; val<n; val++){
        // System.out.print(" ");
        // }
        // for(int val = 0; val<line+1; val++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // HOLLOW RECTANGLE
        // * * * * *
        // * *
        // * *
        // * * * * *
        // for(int i=0;i<n;i++){
        // for(int j=0;j<n+1;j++){
        // if(i==0 || i==n-1){
        // System.out.print("* ");
        // }else if(j==0 || j==n){
        // System.out.print("* ");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Char Pyramid
        // char ch = 'A';
        // for(int i=0;i<n;i++){
        // for(int j=0;j<i+1;j++){
        // System.out.print(ch+" ");
        // ch++;
        // }
        // System.out.println();
        // }

        // Half Pyramid
        // for(int i=0;i<n;i++){
        // for(int j=0;j<i+1;j++){
        // System.out.print(j+1+" ");
        // }
        // System.out.println();
        // }
    }
}
