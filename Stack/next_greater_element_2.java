// find next greater element using 2nd method
import java.util.*;
public class next_greater_element_2 {
    public static void nextGreaterElement(int arr[]){

   
        Stack<Integer> s = new Stack<>();

        int nextGreater[] = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--){
            // step 1:- while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // step 2:- if-else check
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()];
            }

            // step 3:- push
            s.push(i);  //i is index
        }

        // to print nextGreater array
        for(int i = 0; i < nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {3, 6, 1, 0, 5};
        nextGreaterElement(arr);
    }    
}