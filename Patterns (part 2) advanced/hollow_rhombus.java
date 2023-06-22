import java.util.*;
public class hollow_rhombus {
    public static void pattern(int n){
        // outer loop
        // Number of rows has to be printed.
        for(int i = 1; i <= n; i++){
            // spaces = n - i
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            // hollow rectangle or boundary rectangle
            for(int j =1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }   
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