public class multiple_inheritance {
    public static void main(String args[]){
        Bear b = new Bear();
        b.eats();
    }    
}

interface Herbivorous{
    void eats();
}
interface Carnivorous{
    void eats();
}
class Bear implements Herbivorous,Carnivorous{
    public void eats(){
        System.out.println("Eats bot veg and non veg.");
    }
}