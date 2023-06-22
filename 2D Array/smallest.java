import java.util.*;
public class smallest {
    public static int smallestNum(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][5];

        //  Input in 2D Array/matrix
        for(int i = 0; i < matrix.length; i++){
            System.out.print("Enter the element of " + i + " row: ");
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("The smallest number in matrix is : " + smallestNum(matrix));                 
    }    
}