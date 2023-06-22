import java.util.*;
public class practice_Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the week number: ");
        int week_num = sc.nextInt();
        switch (week_num){
            case 1:
            System.out.println("The day is Sunday.");
            break;
            case 2:
            System.out.println("The day is Monday.");
            break;
            case 3:
            System.out.println("The day is Tuesday.");
            break;
            case 4:
            System.out.println("The day is Wednesday.");
            break;
            case 5:
            System.out.println("The day is Thrusday.");
            break;
            case 6:
            System.out.println("The day is Friday.");
            break;
            case 7:
            System.out.println("The day is Saturday.");
            break;
            default:
            System.out.println("This day of week name is not their.");
        }
    }    
}