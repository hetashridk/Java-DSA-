import java.util.*;
public class factorial {
    public static int fact(int n){

        // Base case
        if(n == 0){
            return 1;     //as 0!is 1
        }

        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + fact(n));                
    }    
}