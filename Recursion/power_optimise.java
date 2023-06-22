import java.util.*;
public class power_optimise {
    public static int power(int x, int n){
        // base case
        if(n == 0){
            return 1;
        }

        // int powersq = power(x, n/2) * power(x, n/2);
                        //  or 
        int halfPowerop = power(x, n/2);
        int halfPowersq = halfPowerop * halfPowerop;

        // n is odd
        if((n % 2) != 0){
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;
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