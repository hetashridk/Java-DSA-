public class access_modifier {

    public static void main(String args[]){

        // Calling class via object
        Pen p1 = new Pen();    //p1 = object, Pen() = constructor

        
        p1.setColor("blue");
        System.out.println(p1.getColor());

        

        p1.setTip(5);
        System.out.println(p1.getTip());
    }    
}

//creating a class
class Pen{

    // Tip and color pen ni ander che
    private String color;
    private int tip;


    // Tip and color external property che
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    //  creating Function/method
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}