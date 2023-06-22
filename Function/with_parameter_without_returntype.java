import java.util.*;
public class with_parameter_without_returntype {
    public static void summ(int a, int b){
        int add = a + b;
        System.out.println("The sum is: " + add);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");    
        int num2 = sc.nextInt();
        summ(num1, num2);             
    }    
}