package OOPS;

public class InheritenceClass {
    public static void main(String[] args) {
        // Shark shark = new Shark();
        // shark.bite();
        // shark.eat();
        Mammals mammals = new Mammals();
        mammals.walk();
    }
}
//Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
class Fishs extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

//Derived Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}
class Shark extends Fish{
    void bite(){
        System.out.println("Shark hai bhai Kha jaegi sb>>>");
    }
}