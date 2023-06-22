import java.util.*;
public class ternary_operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        String type = ((num % 2) == 0) ? "even" : "odd";
        System.out.println("The number is: " + type);
    }    
}