import java.util.Scanner;

public class ArraysCode {
    public static void main(String[] args) {
        //creation of array
        //int arr[] = new int[10];
        //int numbers[] = {1,2,3,4,5};


        // Scanner sc = new Scanner(System.in);
        // int arr[] = new int[100];
        // arr[0] = sc.nextInt();
        // arr[1] = sc.nextInt();
        // arr[2] = sc.nextInt();
        // System.out.print("Physics : "+arr[0]+"\n");
        // System.out.print("Chemistry : "+arr[1]+"\n");
        // System.out.print("Maths : "+arr[2]+"\n");
        // System.out.print("Percentage of marks : "+((arr[0]+arr[1]+arr[2])/3)+"%");
        // System.out.print("\nLength of array is : "+arr.length);

        int marks[] = {96,87,90};
        System.out.println("Before Update");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        update(marks);
        System.out.println("After Update");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
    public static void update(int[] marks){
        for(int i=0;i<marks.length;i++){
            marks[i]+=2;
        }
    }
}
