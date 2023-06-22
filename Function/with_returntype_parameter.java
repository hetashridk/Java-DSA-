import java.util.*;
public class with_returntype_parameter {
    public static int summ(int a, int b){   //a and b are called parameters or formal parameter.
       return a + b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");    
        int num2 = sc.nextInt();
        int add = summ(num1, num2);    //num1 and num2 are called arguments or actual parameter.
        System.out.println("The summation is: " + add);         
    }    
}