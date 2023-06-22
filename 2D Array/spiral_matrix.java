import java.util.*;
public class spiral_matrix {
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endRow){

            // top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for(int j = endCol - 1; j >= startCol; j--){

                if(startRow == endRow){
                    break;       //If there is single element left as it is already printed in top.
                }

                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for(int i = endRow - 1; i >= startRow + 1; i--){

                if(startCol == endCol){
                    break;     //If there is single element left as it is already printed in right.
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row you want: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of columns you want: ");
        int m = sc.nextInt();
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
        System.out.print("Spiral fashion is : ");
        spiralMatrix(matrix);
    }    

                       
}   
