public class deep_copy {
    public static void main(String args[]){

        Student s1 = new Student();
        s1.name = "Hetashri";
        s1.roll_no = 123;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        System.out.println(s1.name + " " + s1.roll_no + " " + s1.password);

       
        Student s2 = new Student(s1);
        s2.password = "defg";
        s1.marks[2] = 70;      

        System.out.println(s2.name + " " + s2.roll_no + " " + s2.password);

        // to print marks
        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
    }    
}

class Student{
    String name;
    int roll_no;
    String password;
    int marks[];


    // deep copy constructor
    // deep copy constructor copys the array ----so value of marks will not change
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll_no = s1.roll_no;


        // to copy marsks/array
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }   
    }

    Student(){
        marks = new int[3];
        this.name = name;
        this.roll_no = roll_no;
        this.password = password;
    }
}