import java.util.*;
public class diamond_pattern {
    public static void pattern(int n){
        // 1st half
        // outer loop
        // Number of lines is to be print;
        for(int  i = 1; i <= n; i++){
            // spaces = n-i
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            // stars = 2i - 1
            for(int j = 1; j <= ((2*i )- 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        // outer loop
        for(int i = n; i >= 1; i--){
            // spaces = n-i
            for(int j =1; j <= (n - i); j++){
                System.out.print(" ");
            }
            // stars = 2i - 1
            for(int j = 1; j <= ((2*i) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();
        pattern(rows);                 
    }    
}