import java.util.*;
public class practice_Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do{
            System.out.print("Enter the number:");
            number = sc.nextInt();
            if(number % 2 == 0){
                evensum += number;
            }
            else{
                oddsum += number;
            }
            System.out.print("Do you want summ? Press 1 for yes or 0 for no : ");
            choice = sc.nextInt();                 
        }while ( choice == 0);
        System.out.println("Sum of even numbers is: " + evensum);
        System.out.println("Sum of odd numbers is: " + oddsum);
    }    
}