public class abtract_constructor {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        System.out.println(h.color);
    }    
}

abstract class Animal{
    String color;

    Animal(){   //contructor
        color = "brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }

    // will give idea.. but not implementation
    // that is..It will used according to class
    abstract void walk();   
}
class Horse extends Animal{
    void changeColor(){
        color = "chocolate";
    }

    // implementation
    void walk(){
        System.out.println("Walk with 4 legs.");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }

    // implementation
    void walk(){
        System.out.println("Walk with 2 legs.");
    }
}