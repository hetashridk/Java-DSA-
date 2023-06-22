public class largest_smallest {
    public static void getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;       //Integer.MIN_VALUE = -infinite
        int smallest = Integer.MAX_VALUE;     //Integer.MAX_VALUE = +infinite
        for(int i = 0 ; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        for(int i = 0 ; i < numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is: " + smallest);
        System.out.println("Largest number is: " + largest);
        
    }
    public static void main(String args[]){
        int number[] = {3, 5, 1, 56, 43};
        getLargest(number);
    }    
}