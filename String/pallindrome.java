import java.util.*;
public class pallindrome {
    public static boolean isPallindrome(String str){
        for(int i = 0; i < str.length()/2; i++){

            // is not pallindrome
            if(str.charAt(i) != str.charAt(str.length() - 1- i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string which you want to check: ");
        String str = sc.next();
        System.out.println(isPallindrome(str));                 
    }    
}