import java.util.*;
public class butterfly_pattern {
    public static void pattern(int n){
        // 1st half
        // outer loop
        // number of rows is to be printed
        for(int i = 1; i <= n; i++){
            // stars:- i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //spaces:- 2*(n-i)
            for(int j = 1; j <= 2*(n - i); j++){
                System.out.print(" ");
            }
            // stars:- i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i = n; i >= 1; i--){
            // stars:- i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //spaces:- 2*(n-i)
            for(int j = 1; j <= 2*(n - i); j++){
                System.out.print(" ");
            }
            // stars:- i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");  
        int rows = sc.nextInt();
        pattern(rows);               
    }    
}