import java.util.*;
public class max_total_subarrays_sum_by_prefix {
    public static void totalSubarrays(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        // Declaration of prefix.
        int prefix[] = new int[number.length];

        prefix[0] = number[0];   //As there is no sum calculated before 0th index.
        // Calculate prefix array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + number[i];
        }
        for(int i = 0; i < number.length; i++){
            int start = i;
            for(int j = i; j < number.length; j++){
                int end = j;

                // if(start == 0){
                //     currsum = prefix[end];
                // }
                // else{
                //     currsum = prefix[end] - prefix[start - 1];
                // }
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];    

                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
            
        }
        System.out.println("Maximum sum is: " + maxsum);
    }
    public static void main(String args[]){
        int number[] = {2, -1, 6, -4, 10};
        totalSubarrays(number);
    }    
}
       
         

                
               