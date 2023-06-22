// Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline. It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1. "Maximize the total rpofit if only one job can be scheduled at a time."

import java.util.*;

public class job_sequening {

    // will make class of job
    static class Job{
        int id;   //0 - A, 1 - B, 2 - C
        int deadline;
        int profit;

        // will make contructor
        public Job(int i , int d , int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        // will make sortSequence of type ArrayList and data type job(class) to store sorted jobsInfo
        ArrayList<Job> sortSequence = new ArrayList<>();

        for(int i = 0; i < jobsInfo.length; i++){
            sortSequence.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // sort ans in descending order using collections as there is object in this problem
        Collections.sort(sortSequence, (obj1, obj2) -> obj2.profit - obj1.profit);    //for ascending order obj1.profit - obj2.profit
        // we have sort according to the profit so that why we have written .profit, if we want to sort according to deadline we have to write .deadline

        ArrayList<Integer> ans = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < sortSequence.size(); i++){
            Job curr = sortSequence.get(i);
            if(curr.deadline > time){
                ans.add(curr.id);
                time++;
            }
        }

        System.out.println("max jobs are: " + ans.size());

        // to print the jobs
        for(int i = 0; i < ans.size(); i++){
            System.out.print("index of jobs by which if we do this jobs we get maximum profit is: " + ans.get(i)+"\n");
        }
        System.out.println();
    }    
}