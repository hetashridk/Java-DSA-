import java.util.*;
public class fast_expontiation {
    public static int fastexpo(int a, int num){

        int ans = 1;

        while(num > 0){

            // check LSB
            if((num & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            num = num >> 1;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();

        System.out.print("Enter the power: ");
        int a = sc.nextInt();

        System.out.println(fastexpo(num, a));               
    }    
}