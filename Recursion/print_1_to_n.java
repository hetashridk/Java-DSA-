import java.util.*;
public class print_1_to_n {
    public static void printInc(int n){

        // Base case
        if(n == 1){
            System.out.print(n + " ");
            return;
        }

        printInc(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        printInc(n);                 
    }    
}