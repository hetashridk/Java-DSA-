public class kadane {
    public static void kadane(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < number.length; i++){
            currsum += number[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("Maximun sum is: " + maxsum);
    }
    public static void main(String args[]){
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(number);
    }    
}