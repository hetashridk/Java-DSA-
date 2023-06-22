import java.util.*;
public class max_of_3num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("num1 is max");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("num2 is max");
        }
        else{
            System.out.println("num3 is max");
        }
    }
    
    
}