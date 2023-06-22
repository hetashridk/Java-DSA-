import java.util.*;
public class practice_Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter the number which you want to find the factorial: ");
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++){
            fact = i * (i - 1);
        }                 
        System.out.println("Factorial of " + number + " is: " + fact);
    }    
}