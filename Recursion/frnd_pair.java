import java.util.*;
public class frnd_pair {
    public static int frndPair(int n){

        // base case
        if(n == 1 || n == 2){
            return n;
        }

        // int fnm1 = frndPair(n - 1);
        // int fnm2 = (n - 1) * frndPair(n - 2);
        // int totpair = fnm1 + fnm2;

        return frndPair(n - 1) + (n - 1) * frndPair(n - 2); 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");                 
        int n = sc.nextInt();
        System.out.println(frndPair(n));
    }    
}