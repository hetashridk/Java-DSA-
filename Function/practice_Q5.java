import java.util.*;
public class practice_Q5 {
    public static void summ(int num){
        int MyNum = num;
        int summ = 0;
        while (num > 0){
        int Lastdigit = num % 10;
        summ = summ + Lastdigit;
        num = num /10;
        }
    System.out.println("Summ of MyNum is: " + summ);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");  
        int num = sc.nextInt();
        summ(num);               
    }    
}