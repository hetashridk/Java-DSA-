public class method_overriding {
    public static void main(String args[]){
       Deer d = new Deer();
       d.eat();
    }    
}

// Base class/parent class
class Animal{
    void eat(){
        System.out.println("eats");
    }
}

class Deer{
    void eat(){
        System.out.println("eats grass");
    }
}