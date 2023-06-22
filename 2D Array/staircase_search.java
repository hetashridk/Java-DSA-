// search in sorted matrix is call staircase search

import java.util.*;
public class staircase_search {
    public static boolean staircaseSearch(int matrix[][], int key){

        // i = row
        int i = 0;

        // j = columns
        int j = matrix[0].length - 1;

        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == key){
                System.out.println("key is found at: (" + i + "," + j + ")");
                return true;
            }
            else if(key > matrix[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String args[]){

        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of key: ");
        int key = sc.nextInt();

        staircaseSearch(matrix, key);

    }    
}