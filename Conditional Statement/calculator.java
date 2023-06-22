import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the first number: ");    
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt(); 
        System.out.print("Enter the operation you want to perform: ");  
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+':
            System.out.println("Addition is: " + (num1 + num2));
            break;
            case '-':
            System.out.println("Subtraction is: " + (num1 - num2));
            break;
            case '*':
            System.out.println("Multiplication is: " + (num1 * num2));
            break;
            case '/':
            System.out.println("Division is: " + (num1 / num2));
            break;
            case '%':
            System.out.println("Modulo is: " + (num1 % num2));
            break;
            default:
            System.out.println("Wrong Operator");
          
        }         
    }    
}