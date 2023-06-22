import java.util.*;
public class practice_Q1 {
    public static void average(int a, int b, int c){
        int Average = (a + b + c)/3;
        System.out.print("The average of " + a + " , " + b + " and " + c + " = " + Average);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int FirstNum = sc.nextInt();
        System.out.print("Enter second Number: ");
        int SecondNum = sc.nextInt();
        System.out.print("Enter third Number: ");
        int ThirdNum = sc.nextInt();
        average(FirstNum, SecondNum, ThirdNum);
        }    
}