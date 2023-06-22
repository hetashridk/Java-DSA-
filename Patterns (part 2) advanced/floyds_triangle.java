import java.util.*;
public class floyds_triangle {
    public static void pattern(int n){
        // which we will increases with innner group.
        int counter = 1;
        // outer loop
        // Total number rows to be printed.
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows: ");
        int rows = sc.nextInt(); 
        pattern(rows);                
    }    
}