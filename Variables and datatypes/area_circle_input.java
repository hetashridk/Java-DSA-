import java.util.*;
public class area_circle_input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f * r * r;   //f is Used as it denote 3.14 is in float data type as java compiler takes double datatype by default.
        System.out.println(area);
    }    
}