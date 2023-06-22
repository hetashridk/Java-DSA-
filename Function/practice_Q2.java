import java.util.*;
public class practice_Q2 {
    public static boolean IsEven(int Num){
    boolean IsEvenn = true;
        if(Num % 2 != 0){
            IsEvenn = false;
        }
        return IsEvenn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to check : ");       
        int Num = sc.nextInt(); 
        if(IsEven(Num)){
            System.out.println(Num + " is even. ");
        }         
        else{
            System.out.println(Num + " is odd. ");
        }
    }    
}