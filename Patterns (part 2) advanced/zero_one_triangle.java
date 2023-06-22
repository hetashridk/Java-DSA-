import java.util.*;
public class zero_one_triangle {
    public static void pattens(int n){
        // outer loop
        // Numbers of rows is to be printed.
        for(int i = 1; i <= n; i++){
            // how many times is to be print.
            for(int j = 1; j <= i; j++){
                if ((i + j) % 2 == 0){
                    System.out.print(1);      //if sum of i and j is even print 1.
                }
                else{
                    System.out.print(0);     //if sum of i and j is odd then print 0.
                }
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");        
        int rows = sc.nextInt();
        pattens(rows);         
    }    
}