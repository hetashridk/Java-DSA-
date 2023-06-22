import java.util.*;
public class practice_Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencilprice = sc.nextFloat();
        float penprice = sc.nextFloat();
        float eraserprice = sc.nextFloat();
        float cost = (pencilprice + penprice + eraserprice) * 0.18f;
        System.out.println("cost is: " + cost);
    }    
}