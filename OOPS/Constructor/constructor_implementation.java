public class constructor_implementation {
    public static void main(String args[]){
        Tuna t = new Tuna();
    }    
}

// Base class/parent class
class Animal{
    
    // constructor
    Animal(){
        System.out.println("Animal constructor is call");
    }
}

// Derived class/sub class/child class
class Fish extends Animal{
    // constructor
    Fish(){
        System.out.println("Fish constructor is call");
    }
}
class Tuna extends Fish{
   // constructor
    Tuna(){
        System.out.println("Tuna constructor is call");
    }
}