import java.util.PriorityQueue;

public class ComapringObjects {

    // Comaparble is interfaces used to implments PriorityQueue
    public static class Student implements Comparable<Student> {
        int rank;        
        String name;

        public Student(int rank, String name){
            this.rank = rank;
            this.name = name;
        }

        // as compareTo method is used to compare 
        // s2  is object of student
        // we have used override coz compareTo is already inbuilt method/function of Comparable interface
        //    this.rank(s1)   s2.rank(s2)           logic
        //       12     -    15   => -3  => negative => s1 < s2
        //       15     -    12   => 3  => positive => s1 > s2
        //       15     -    15   => 0  => equal => s1 = s2
        // this above logic is inbuilt in Comparable interface
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
         PriorityQueue<Student> pq = new PriorityQueue<>();
            pq.add(new Student(12, "A"));
            pq.add(new Student(1, "B"));
            pq.add(new Student(45, "C"));
            pq.add(new Student(30, "D"));
            pq.add(new Student(15, "E"));


            while(!pq.isEmpty()){
                System.out.println(pq.peek().name + " => " + pq.peek().rank);
                pq.remove();
            }
    }
}
