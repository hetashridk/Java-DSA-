import java.util.*;
public class pallindrome_pattern_numbers {
    public static void pattern(int n){
        // outer loop
        // number of row is to be printed
        for(int i = 1; i <= n; i++){
            // inner loop
            // spaces = n - i
            for(int j = 1; j <= (n - i);j++){
                System.out.print(" ");
            }
            // descding = i to 1
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            // aescending = 2 to i
            for(int j = 2; j <= i; j++){
                System.out.print(j);
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