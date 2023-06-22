import java.util.*;
public class inverted_half_pyramid_num {
    // n = number of rows
    public static void pattern(int n){
        // outer loop.
        // Numbers of rows to be printed.
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");   
        int row = sc.nextInt();
        pattern(row);              
    }    
}