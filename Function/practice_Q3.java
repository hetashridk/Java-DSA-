import java.util.*;
public class practice_Q3 {
    public static boolean IsPallindrome(int Num){
        boolean IsPallindrome = false;
        int MyNum = Num;
        int reverse = 0;
        while (Num != 0){
            int Remainder = Num % 10;
            reverse =  reverse * 10 + Remainder;
            Num = Num / 10;
        }
        if(MyNum == reverse){
            IsPallindrome = true;
        }
        return IsPallindrome;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nUmber Which you want to check: ");   
        int Num = sc.nextInt(); 
        if(IsPallindrome(Num)){
            System.out.println(Num + " is Pallindrome. ");
        }         
        else{
            System.out.println(Num + " is not Pallindrome. ");              
        }    
    }
}