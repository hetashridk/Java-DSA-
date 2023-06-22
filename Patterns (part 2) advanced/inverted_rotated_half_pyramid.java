import java.util.*;
public class inverted_rotated_half_pyramid {
    public static void pattern(int n){  //n = number of rows.
        //outer loop
       //how many lines/rows has to be printed
       for(int i = 1; i <= n; i++){
           //spaces
            for(int j = 1; j <= n - i;j++){ 
                //spaces = row - star....as star = number of rows
                System.out.print(" ");
            }
            //Stars...as star = number of rows 
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of rows: ");   
        int rows = sc.nextInt();
        pattern(rows);              
    }    
}