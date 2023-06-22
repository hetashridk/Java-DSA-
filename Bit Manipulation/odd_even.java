import java.util.*;
public class odd_even {
    public static void oddOrEven(int num){
        int bitMask = 1;

        if((num & bitMask) == 0){
            // for even
            System.out.println("Even");
        }
        else{
            // for odd_even
            System.out.println("odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number which you want to check: ");                 
        int num = sc.nextInt();
        oddOrEven(num);
    }    
}