import java.util.*;
public class solid_rhombus {
    public static void pattern(int n){
        // outer lopp.
        // number of rows is to be print.
        for(int i = 1; i <= n; i++){
            // spaces = n - i.
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            // stars = n
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        pattern(rows);                 
    }    
}