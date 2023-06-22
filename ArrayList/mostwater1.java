// container with most water by brute force
import java.util.ArrayList;
public class mostwater1 {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;

        // for pair of 1st line
        for(int i = 0; i < height.size(); i++){
            // for pair of 2nd line
            for(int j = i + 1; j < height.size(); j++){

                // out of both line which line is small
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(currWater, maxWater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }    
}