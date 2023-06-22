import java.util.*;
public class diagonal_sum {
    public static int diagonalSum(int matrix[][]){

        int sum = 0;

        for(int  i = 0; i < matrix.length; i++){

            // Primary Diagonal
            sum += matrix[i][i];

            // Secondary Diagonal
            if( i != matrix.length - i -1){
                sum += matrix[i][matrix.length - i -1];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter the number of row you want: ");
        int n = sc.nextInt();

        int m = n;

        int matrix[][] = new int[n][m];

        //  Input in 2D Array/matrix
        for(int i = 0; i < matrix.length; i++){
            System.out.print("Enter the element of " + i + " row: ");
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        } 

          // output
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");                 
               
            }
            System.out.println();
        }
        System.out.print("Diagonal sum is: " + diagonalSum(matrix));                 
    }    
}