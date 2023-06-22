// Given two arrays A and B of equal length n. Pair ezch elemnet of array A to an elemnet in array B, such that sum S of absolute differences of all pairs is minimum

import java.util.*;
public class min_absolue_difference_pairs {
    public static void main(String args[]){
        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i = 0; i < A.length; i++){

            // Math.abs will give absolute value
            minDiff = minDiff + Math.abs(A[i] - B[i]);
        }
        System.out.println("minimum differences is: " + minDiff);
    }    
}