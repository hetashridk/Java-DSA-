public class static__ {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "NME";

        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "HME";
        System.out.println(s3.schoolName);

        s3.phy = 50;
        s3.chem = 50;
        s3.maths = 50;
        System.out.println(s3.retrunCGPA);
        
    }    
}

class Student{

    static int retrunCGPA(int phy, int math, int chem){
        return (phy + maths + chem)/3;
    }
    int roll_no;
    String name;
    
    static String schoolName;

    void setname(String name){
        this.name = name;
    }

    String getschoolName(){
        return this.name;
    }
}