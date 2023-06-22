import java.util.*;
public class count_set_bit {
    public static int countSetBit(int num){
        int count = 0;

        // till number is 0
        while(num > 0){

            // check the LSB 
            if((num & 1) != 0){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();

        System.out.println(countSetBit(num));                 
    }    
}