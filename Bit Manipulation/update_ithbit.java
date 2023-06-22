import java.util.*;
public class update_ithbit {

    public static int clearIthBit(int num, int i){
        int bitMask = ~(1 << i);
        return num & bitMask;
    }

    public static int updateIthBit(int num, int i ,int newBit){
        num = clearIthBit(num, i);
        int bitMask = newBit << i;
        return num | bitMask;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();

        System.out.print("Enter the ith bit: ");     
        int i = sc.nextInt();

        System.out.print("Enter the newBit bit: ");     
        int newBit = sc.nextInt();
        System.out.println(updateIthBit(num, i, newBit));                               
    }    
}