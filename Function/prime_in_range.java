import java.util.*;
public class prime_in_range {
    public static boolean isPrimee(int n){
        boolean isPrimee = true;
        if( n == 2){
            return isPrimee;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrimee = false;
                break;
            }
        }
        return isPrimee;    
       
    }
    public static void primeInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrimee(i)){      //check if number is prime or not.
                System.out.print(i + " ");
            }
        }
    System.out.println("");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(primeInRange(num));                 
    }  
}  
