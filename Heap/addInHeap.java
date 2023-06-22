import java.util.ArrayList;

public class addInHeap {
    public static class add{
        ArrayList<Integer> al = new ArrayList<>();

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
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
