// find max area/rectangle in histogram
import java.util.*;
public class maxarea_histogram {
    public static void maxarea(int height[]){
        Stack<Integer> s = new Stack<>();
        int maxarea = 0;
        int nsl[] = new int[height.length];
        int nsr[] = new int[height.length];

        // for next smallest right
        for(int i = height.length - 1; i >= 0; i--){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = height.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // for next smallest right

        // stack ne empty kariyu
        s = new Stack<>();
        for(int i = 0; i < height.length; i++){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

    // to find maxarea
        for(int i = 0; i < height.length; i++){
            int height_bar = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currarea = height_bar * width;
            maxarea = Math.max(currarea, maxarea);
        }
        System.out.println("maxarea is: " + maxarea);
    }

    public static void main(String args[]){
        int height[] = {2, 1, 5, 6, 2, 3};
        maxarea(height);
    }    
}