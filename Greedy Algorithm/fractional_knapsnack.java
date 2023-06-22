// Given the weigth and values of N itmes, put these items in a knapsnack of capacity W to "get maximum total value" in knapsnack

// knapsnack = bag
import java.util.*;
public class fractional_knapsnack {
    public static void main(String args[]){
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        // to sort
        double ratio[][] = new double[value.length][2];

        for(int i = 0; i < ratio.length; i++){
            ratio[i][0] = i; //index
            ratio[i][1] = value[i] / (double)weight[i]; //ratio
        }

        // ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // for descending order:- reversal for loop
        int Capacity = W;
        int finalValue = 0;
        for(int i = ratio.length - 1; i >= 0; i--){

            // item pick
            int index = (int)ratio[i][0];

            
            if(Capacity >= weight[index]){
                finalValue = finalValue + value[index];
                Capacity = Capacity - weight[index];
            }
            else{
                finalValue = finalValue + (int)(ratio[i][1] * Capacity);
                Capacity = 0;
                break;
            }
            
        }
        System.out.println("Maximum total value is: " + finalValue);
    }    
}