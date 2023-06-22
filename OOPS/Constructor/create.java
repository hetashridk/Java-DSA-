public class create {
    public static void main(String args[]){

        // call of constructor
        Student s1 = new Student();

        Faculty f1 = new Faculty("hetashri", 123);
        System.out.println(f1.name);
        System.out.println(f1.id);
    }    
}

class Student{
    String name;
    int roll_no;

    // intialization/creation of constructor without parameter
    Student(){
        System.out.println("constructor is call.....");
    }
}

class Faculty{
    String name;
    int id;

     // intialization/creation of constructor with parameter
     Faculty(String name, int id){
        this.name = name;
        this.id = id;
        

     }
}