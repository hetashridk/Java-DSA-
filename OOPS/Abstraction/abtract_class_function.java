public class abtract_class_function {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }    
}

abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }

    // will give idea.. but not implementation
    // that is..It will used according to class
    abstract void walk();   
}
class Horse extends Animal{

    // implementation
    void walk(){
        System.out.println("Walk with 4 legs.");
    }
}
class Chicken extends Animal{

    // implementation
    void walk(){
        System.out.println("Walk with 2 legs.");
    }
}