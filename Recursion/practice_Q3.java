import java.util.*;
public class practice_Q3 {
    public static int length(String str){

        // base case
        if(str.length() == 0){
            return 0;
        }

        // kaam
        return length(str.substring(1)) + 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(length(str));
    }    
}