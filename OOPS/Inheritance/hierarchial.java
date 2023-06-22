public class hierarchial {
    public static void main(String args[]){
        Bird crow = new Bird();
        crow.eat();
        crow.fly();
        crow.breath();
    }    
}

// Base class/parent class
class Animal{
    String color;

    void breath(){
        System.out.println("breathe");
    }
    void eat(){
        System.out.println("eats");
    }

}

// Derived class/sub class/child class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}

class Mammal extends Animal{
    int legs;

    void walk(){
        System.out.println("walks");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flyes");
    }
}