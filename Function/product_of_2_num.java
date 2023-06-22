import java.util.*;
public class product_of_2_num {
    public static int product(int a, int b){  
       return a * b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");    
        int num2 = sc.nextInt();
        int mul = product(num1, num2);    
        System.out.println("The product is: " + mul);         
    }    
}