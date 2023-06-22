// you are an activity with their start and end times. Select the maximun number of activities that can be performed by single person assuming that person can only work on a single activity at a time. activities are sorted according to end time.

// activity selection of sorted time
import java.util.*;
public class activity_selection {
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // maxAct = max. activities = count
        int maxAct = 0;
        ArrayList<Integer> ans= new ArrayList<>();
        
        // already sorted on basis of end time
        maxAct = 1;

        // first activity is to be added
        ans.add(0);

        // to trace the last chosen activity end time
        int lastEnd = end[0];
        for(int i = 1; i < end.length; i++){      //or i < start.length
            if(start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activities: " + maxAct);

        // to print activities
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A"+ans.get(i) + " ");
        }
    }    
}