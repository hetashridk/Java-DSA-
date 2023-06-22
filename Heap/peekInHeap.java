import java.util.ArrayList;

public class peekInHeap {
    public static class Heap{
        ArrayList<Integer> al = new ArrayList<>();

        public void peek(){
            System.out.println(al.get(0));
        }


            //    OR
        // public int peek(){
        //     return al.get(0);
        // }
    }
}
