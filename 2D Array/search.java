import java.util.*;
public class search {
    public static boolean search(int matrix[] [], int key){
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i] [j] == key){
                    System.out.print("Element found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.print("Element not found");
        return false;
    }
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


        // input key
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");                 
               
            }
            System.out.println();
        }
        System.out.print("Enter element you want to search: ");
        int key = sc.nextInt();
        search(matrix, key);
    }    
}