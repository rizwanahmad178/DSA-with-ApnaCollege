package OOPS;

public class PolymorphismJava {
    public static void main(String[] args) {
        //Method Overloading
        // Calculator calculator = new Calculator();
        // System.out.println(calculator.sum(2,8));
        // System.out.println(calculator.sum((float)2.2,(float)8.1));
        // System.out.println(calculator.sum(2,8,3));
        //Method Overriding
        Deer d = new Deer();
        d.eat();
    }

}
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}