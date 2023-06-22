public class total_subarrays {
    public static void totalSubarrays(int number[]){
        int totalsubarrays = 0;  
        int summ = 0;
        for(int i = 0; i < number.length; i++){
            int start = i;
            for(int j = i; j < number.length; j++){
                int end = j;
                summ = 0;
                for(int k = start; k <= end; k++){
                    System.out.println(number[k] + " ");
                    summ = summ + number[k];
                }
                System.out.println("Sum of Subarrays is: " + summ);
                totalsubarrays = totalsubarrays + 1;
                System.out.println();
            }
            System.out.println();
        }
       
        System.out.println("Total Subarrays = " + totalsubarrays);  
    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10};
        totalSubarrays(number);
    }    
}