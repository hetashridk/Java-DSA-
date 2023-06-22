import java.util.*;
public class fibbonacci {
    public static int fib(int n){

        // base case
        if(n == 0 || n == 1){
            return n;
        }
         

        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt(); 
        System.out.println(fib(n));                
    }    
}