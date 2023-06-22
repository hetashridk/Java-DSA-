public class create {

    public static void main(String args[]){

        // Calling class via object
        Pen p1 = new Pen();    //p1 = object, Pen() = constructor

        
        // p1.setColor("blue");
        // or we can write
        p1.color = "blue";
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);
    }    
}

//creating a class
class Pen{

    // inserting property/attribute
    String color;
    int tip;

    //  creating Function/method
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}