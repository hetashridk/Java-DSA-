import java.util.*;
public class max_total_subarrays_sum {
    public static void totalSubarrays(int number[]){
        int totalsubarrays = 0;  
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < number.length; i++){
            int start = i;
            for(int j = i; j < number.length; j++){
                int end = j;
                currsum = 0;    //we have declare currsum here too because currsum value will be change
                for(int k = start; k <= end; k++){
                    System.out.println(number[k] + " ");
                    currsum = currsum + number[k];
                }
                if(maxsum < currsum){
                    maxsum = currsum;
                }
                System.out.println("Sum of Subarrays is: " + currsum);
                totalsubarrays = totalsubarrays + 1;
                System.out.println();
            }
            System.out.println("Maximum sum is: " + maxsum);
            System.out.println();
        }
       
        System.out.println("Total Subarrays = " + totalsubarrays);  
    }
    public static void main(String args[]){
        int number[] = {2, -1, 6, -4, 10};
        totalSubarrays(number);
    }    
}