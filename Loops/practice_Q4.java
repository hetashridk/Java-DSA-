import java.util.*;
public class practice_Q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want the multiplication table: ");        
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + "*" + i + "=" + (num*i));
        }         
    }    
}