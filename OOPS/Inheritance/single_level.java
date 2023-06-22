public class single_level {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.breath();
        shark.eat();
        shark.color = "blue";
        System.out.println(shark.color);
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