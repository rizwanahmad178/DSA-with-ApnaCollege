import java.util.Scanner;

public class Assignment2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total_cost = pen + pencil + eraser;
        float gst_cost = 0.18f * total_cost;
        System.out.println("Total Cost : "+total_cost);
        System.out.println("Total Cost with 18% GST: "+(total_cost+gst_cost));
        // int side = sc.nextInt();
        // int area = side * side;
        // System.out.println(area);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (a + b + c)/3;
        // System.out.println(avg); 
    }
}