import java.util.*;
public class create {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Creation of matrix/2D Array.
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;

        //  Input in 2D Array/matrix
        for(int i = 0; i < n; i++){
            System.out.print("Enter the element of " + i + " row: ");
            for(int j = 0; j < m; j++){
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
    }    
}