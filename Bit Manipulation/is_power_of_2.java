import java.util.*;
public class is_power_of_2 {
    public static boolean isPowerOfTwo(int num){
        return ((num & (num - 1)) == 0);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();
        System.out.println(isPowerOfTwo(num));               
    }    
}