public class call_by_reference {
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {12, 123, 45};
        update(marks);
        for(int i = 0; i < marks.length; i++){
            System.out.println("marks: " + marks[i]);
        }
        System.out.println();
    }    
}