import java.util.ArrayList;

public class removeInHeap {
    public static class Heap{
        ArrayList<Integer> al = new ArrayList<>();


        // insert in heap
        // function
        public void add(int data){
            
            // add at last index
            al.add(data);

            // fix heap
            int child = al.size() - 1;
            int parent = (child - 1) / 2;

            while(al.get(child) < al.get(parent)){    //TC:- O(logn)

                // swap
                int temp = al.get(child);
                al.set(child, parent);
                al.set(parent, temp);

                child = parent;
                parent = (child - 1) / 2;
            }
        }


        public int peek(){
            return al.get(0);
        }


        // heapify function
        public void heapify(int i){
            int min = i;
            int left = 2*i + 1;
            int right = 2*i + 2;

            if(left < al.size() && al.get(left) < al.get(min)){
                min = left;
            }

            if(right < al.size() && al.get(right) < al.get(min)){
                min = right;
            }

            // if heap is not heap 
            // so the compiler do disturb the already set heap we have written above coe
            if(min != i){
                int temp = al.get(i);
                al.set(i, al.get(min));
                al.set(min, temp);
            }

            // if due to one heapify other is disturbed we can also set them too
            heapify(min);
        }
        // to remove
        public int remove(){
            
            // step 1:- swap
            int data = al.get(0);

            int temp = al.get(0);
            al.set(0, al.get(al.size() - 1));
            al.set(al.size() - 1, temp);

            // step 2:- remove/delete last element
            al.remove(al.size() - 1);

            // step 3:- heapify
            heapify(0);

            return data;
        }


        // isEmpty function
        public boolean isEmpty(){
            return al.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(0);
        h.add(5);
        h.add(11);
        h.add(17);
        h.add(7);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
