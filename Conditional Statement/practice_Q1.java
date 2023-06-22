import java.util.*;
public class practice_Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to check: "); 
        int number = sc.nextInt();
        if (number > 0){
            System.out.println(number + " is positive");
        }                
        else if (number < 0){
            System.out.println(number + " is negative");
        }
        else{
            System.out.println("You have enter number = 0 which is neither positive nor negative");
        }
    }    
}