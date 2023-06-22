import java.util.*;
public class hollow_rectangle {
    public static void pattern(int totrows, int totcols){
        //outer loop
        //how many lines/rows has to be printed
        for(int i = 1; i <= totrows; i++){
            //inner columns
            for(int j = 1; j <= totcols; j++){
            // cell (i,j)
            if(i == 1 || i == totrows || j == 1 || j == totcols){
                //boundary cell
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
        System.out.print("Enter the total number of rows: "); 
        int rows = sc.nextInt();
        System.out.print("Enter the total number of colums: "); 
        int columns = sc.nextInt();
        pattern(rows, columns);               
    }    
}