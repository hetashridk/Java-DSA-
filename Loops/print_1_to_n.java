import java.util.*;
public class print_1_to_n {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number where you want to print: ");      
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n){
            System.out.println(counter);
            counter++;
        }           
    }    
}