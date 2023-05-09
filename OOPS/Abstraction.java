package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        //Horse h = new Horse();
        // h.eat();
        // h.walk();
        //Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        //Animal ani = new Animal(); can't be created

        Mustang must = new Mustang();
        //Animal Constructor -> Horse Constructor -> Mustang Constructor
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor Called");
    }
    void eat(){
        System.out.println("Eats Everything");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
    void changeColor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Walks on 4 Legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken Constructor Called");
    }
    void changeColor(){
        color = "Light Brown";
    }
    void walk(){
        System.out.println("Walks on 2 Legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor Called");
    }
    void changeColor(){
        color = "White";
    }
    void walk(){
        System.out.println("Walks on 4 Legs");
    }
}