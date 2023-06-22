public class super__ {
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }    
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal  constructor is call");
    }
}

class Horse extends Animal{
    Horse(){
        // super();
        super.color = "Brown";
        System.out.println("Horse contructor is called");
    }
}