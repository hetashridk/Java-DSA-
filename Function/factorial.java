import java.util.*;
public class factorial {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want factorial: ");
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.println("The factorial of " + n + " is : " + f);                 
    }    
}