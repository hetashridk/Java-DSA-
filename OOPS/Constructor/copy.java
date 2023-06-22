public class copy {
    public static void main(String args[]){

        Student s1 = new Student();
        s1.name = "Hetashri";
        s1.roll_no = 123;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        System.out.println(s1.name + " " + s1.roll_no + " " + s1.password);

        // copys the value of s1 in s2
        // copy constructor called
        Student s2 = new Student(s1);
        s2.password = "defg";
        s1.marks[2] = 70;      //here marks is also changed in s2 so ti solve this issue we used shallow and deep copy.

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


    // copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        this.marks = s1.marks;    //s1 nu reference copy thayu che... means navu array nai baniyu.. khali s2 ae aj phela na array ne copy karse
    }

    Student(){
        marks = new int[3];
        this.name = name;
        this.roll_no = roll_no;
        this.password = password;
    }
}