import java.util.*;
public class clear_last_ithbit {
    public static int clearLastIthBit(int num, int i){

        int bitMask = (~0) << i;
        return num & bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();

        System.out.print("Enter the ith bit: ");     
        int i = sc.nextInt();
        System.out.println(clearLastIthBit(num, i));                              
    }    
}