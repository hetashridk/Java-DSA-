import java.util.*;
public class sum_of_first_n_natural_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number where you want to do the sum: ");  
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n){
            sum = sum + i;
            i++;
        }      
        System.out.println("The sum is: " + sum);  
    }    
}