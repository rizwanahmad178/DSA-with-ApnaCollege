package OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println("Color of the Horse is : "+h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor Called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "Brown";
        System.out.println("Horse Constructor Called");
    }
}