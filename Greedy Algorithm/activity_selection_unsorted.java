// you are an activity with their start and end times. Select the maximun number of activities that can be performed by single person assuming that person can only work on a single activity at a time. activities are not sorted.

// activity selection of unsorted time
import java.util.*;
public class activity_selection_unsorted {
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // to sort
        int activities[][] = new int[start.length][3];

        for(int i = 0; i < start.length; i++){

            // have store index becoz after sorting index will be unordered so to prevent unordering of index we have stored index
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lamda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // maxAct = max. activities = count
        int maxAct = 0;
        ArrayList<Integer> ans= new ArrayList<>();
        
        // already sorted on basis of end time
        maxAct = 1;

        // first activity is to be added
        ans.add(activities[0][0]);

        // to trace the last chosen activity end time
        int lastEnd = activities[0][2];
        for(int i = 1; i < end.length; i++){      //or i < start.length
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activities: " + maxAct);

        // to print activities
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A"+ans.get(i) + " ");
        }
    }    
}