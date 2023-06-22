import java.util.*;
public class print_n_to_1 {
    public static void printDec(int n){

        // Base case
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printDec(n - 1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        printDec(n);                 
    }    
}