import java.util.*;
public class clear_range_of_bits {
    public static int clearRangeOfBits(int num, int i, int j){
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return bitMask & num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();

        System.out.print("Enter the ith bit: ");     
        int i = sc.nextInt();

        System.out.print("Enter the jth bit: ");     
        int j = sc.nextInt();
        System.out.println(clearRangeOfBits(num, i ,j));                  
    }    
}