public class multi_level {
    public static void main(String args[]){
        Dog doggy = new Dog();
        doggy.eat();
        doggy.breath();
        doggy.legs = 4;
        System.out.println(doggy.legs);
        doggy.breed = "indie";
        System.out.println(doggy.breed);
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

// Derived class/sub class/ child class
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}