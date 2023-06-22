import java.util.*;
public class decimal_to_binary {
    public static void DecimalToBinary(int DecNum){
        int MyNum = DecNum;
        int power = 0;
        int BinaryNum = 0;
        while (DecNum > 0){
            int Remainder = DecNum % 2;  //To find and store remainder.
            //Here we have divided with as it is formula...
            BinaryNum = BinaryNum + (Remainder * (int)Math.pow(10, power));   //Here is 10 is taken because we have to put number on ones place, tens place, hundreds place etc.... and from which form which to convert that base we have to write.
            power++;
            DecNum = DecNum / 2;  //To remove the lastdigtit of actual number.
        }
        System.out.println("Binary of " + MyNum + " is " + BinaryNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");   
        int num = sc.nextInt();
        DecimalToBinary(num);

    }    
}