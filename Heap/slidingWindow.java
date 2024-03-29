import java.util.PriorityQueue;

public class slidingWindow {

    public static class Pair implements Comparable<Pair>{
        int val; 
        int index;

        public Pair(int val, int index){
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p2){
            // descending
            return p2.val - this.val;
        }
    }
    public static void main(String[] args) {   //TC:- O(nlogk)
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int res[] = new int[arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window
        for(int i = 0; i < k; i++){
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().val;

        for(int i = k; i < arr.length; i++){
            while(pq.size() > 0 && pq.peek().val <= (i - k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i - k + 1] = pq.peek().val;
        }

        // to print res
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
