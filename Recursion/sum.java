// sum of first n natural number
import java.util.*;
public class sum {
    public static int sum(int n){

        // Base case
        if(n == 1){
            return 1;     //as 0!is 1
        }

        int Snm1 = sum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.println("The sum of first" + n + " natural number is " + sum(n));                
    }    
}