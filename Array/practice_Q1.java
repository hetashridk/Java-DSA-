import java.util.*;
public class practice_Q1 {
    public static boolean checkValueTwice(int number[]){
         boolean isTwice = false;
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                if(number[i] == number[j]){
                    isTwice = true;
                }
            }
        }
        return isTwice;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elments you want to store in an array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array numbers: "); 
        int number[] = new int[n];
        for(int  i = 0; i < n; i++){
            number[i] = sc.nextInt();
        }   
        System.out.println(checkValueTwice(number));             
    }    
}