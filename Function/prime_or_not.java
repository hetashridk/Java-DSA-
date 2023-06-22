import java.util.*;
public class prime_or_not {
    public static boolean isPrimee(int n){
        boolean isPrimee = true;
        if( n == 2){
            return isPrimee;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrimee = false;
                break;
            }
        }
        return isPrimee;    
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(isPrimee(num));                 
    }  
}  
