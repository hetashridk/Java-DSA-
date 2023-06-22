import java.util.*;
public class prime_or_not_using_math_lib {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to check: ");
        int n = sc.nextInt();
        if (n == 2){
            System.out.println(n + " is prime.");
        }                
        else{
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++){  //Math.sqrt = square root of n.
                if (n % i == 0){
                    isPrime = false;
                }
            }
            if (isPrime == true){
                System.out.println(n + " is prime.");
            }
            else{
                System.out.println(n + " is not prime.");
            }
        }
    }    
}