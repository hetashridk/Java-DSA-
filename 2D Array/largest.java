import java.util.*;
public class largest {
    public static int largestNum(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
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

        System.out.print("The largest number in matrix is : " + largestNum(matrix));                 
    }    
}