// find next greater element by brute force method
import java.util.*;
public class next_greater_element_1 {
    public static void nextGreaterElement(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int nextGreaterElement = -1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    nextGreaterElement = arr[j];
                    break;
                }
                
            }
            System.out.print(nextGreaterElement + " ");
        }
       
    }

    public static void main(String args[]){
        int arr[] = {6, 8, 0, 1, 3};
        nextGreaterElement(arr);
        
    }    
}