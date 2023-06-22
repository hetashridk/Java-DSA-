import java.util.*;
public class get_ithbit {
    public static int getIthBit(int num, int i){
        int bitMask = 1 << i;

        if((num & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();

        System.out.print("Enter the ith bit: ");     
        int i = sc.nextInt();
        System.out.println(getIthBit(num, i));            
    }    
}