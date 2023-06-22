public class parameterized_nonparameterized {
    public static void main(String args[]){

        // call of constructor
        Student s1 = new Student();

        Student s2 = new Student("Hetashri");
        System.out.println(s2.name);

        Student s3 = new Student(123);
        System.out.println(s3.roll_no);

        Student s4 = new Student("Harshal", 456);
        System.out.println(s4.name + " " +  s4.roll_no);

        
    }    
}

class Student{
    String name;
    int roll_no;

    // intialization/creation of constructor without parameter
    Student(){
        System.out.println("constructor is call.....");
    }

    // intialization/creation of constructor with parameter
    Student(String name){
        this.name = name;
    }
    Student(int roll_no){
        this.roll_no = roll_no;
    }
    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
}

