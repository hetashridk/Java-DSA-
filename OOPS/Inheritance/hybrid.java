public class hybrid {
    public static void main(String args[]){
        Peacock p1 = new Peacock();
        p1.eat();
        p1.fly();
        p1.breath();
        p1.eatsveg();
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
class Tuna extends Fish{
    int length;
}
class Shark extends Fish{
    String size;
}



class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}
class Human extends Mammal{
    String hair;
}
class Dog extends Mammal{
    void tail(){
        System.out.println("has tail");
    }
}
class Cat extends Mammal{
    void jump(){
        System.out.println("jumps higher than dog");
    }
}


class Bird extends Animal{
    void fly(){
        System.out.println("Flyes");
    }
}
class Peacock extends Bird{
    void eatsveg(){
        System.out.println("Only eats veg.");
    }
}
class Eagle extends Bird{
    void eatsnonveg(){
        System.out.println("Eats nonveg too.");
    }
}