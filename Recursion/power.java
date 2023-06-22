import java.util.*;
public class power {
    public static int power(int x, int n){
        // base case
        if(n == 0){
            return 1;
        }

        return x * power(x, n - 1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of power: ");
        int n = sc.nextInt(); 

        System.out.print("Enter the value of number: ");
        int x = sc.nextInt(); 
        System.out.println(power(x, n));                
    }    
}