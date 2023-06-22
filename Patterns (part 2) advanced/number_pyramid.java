import java.util.*;
public class number_pyramid {
    public static void pattern(int n){
        // outer loop
        // Number of rows is to be print
        for(int i = 1; i <= n; i++){
            // spaces = n - i
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            // number = i amd i times
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int rows = sc.nextInt();
        pattern(rows);                 
    }    
}