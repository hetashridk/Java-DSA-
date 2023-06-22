import java.util.*;
public class output_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.print("Enter the marks:");
        marks[0] = sc.nextInt();
        System.out.print("Enter the marks:");
        marks[1] = sc.nextInt();
        System.out.print("Enter the marks:");
        marks[2] = sc.nextInt();
        System.out.print("Enter the marks:");
        marks[3] = sc.nextInt();
        System.out.print("Enter the marks:");
        marks[4] = sc.nextInt();  
        System.out.println("phy: " + marks[0]);            
        System.out.println("maths: " + marks[1]);            
        System.out.println("cse: " + marks[2]);            
        System.out.println("chem: " + marks[3]);            
        System.out.println("dsa: " + marks[4]);            
    }    
}