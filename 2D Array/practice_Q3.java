import java.util.*;
public class practice_Q3 {
    public static void printMatrix(int matrix[][]){
          
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");                 
               
            }
            System.out.println();
        }
    }    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int row  = 2;
        int col = 3;
         int matrix[][] = new int [row][col];


        //  Input in 2D Array/matrix
        for(int i = 0; i < matrix.length; i++){
            System.out.print("Enter the element of " + i + " row: ");
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        } 


        // transpose
        int transpose[][] = new int[col][row];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        // original matrix 
        System.out.println("original matrix is: ");
        printMatrix(matrix);

        // transpose matrix
        System.out.println("Transpose of that matrix is: ");
        printMatrix(transpose);


    }    
}