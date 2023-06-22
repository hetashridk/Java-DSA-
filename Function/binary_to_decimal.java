import java.util.*;
public class binary_to_decimal {
    public static void BinaryToDecimal(int BinNum){
        int MyNum = BinNum;
        int decimalNum = 0;
        int power = 0;
        while(BinNum > 0){
            int LastDigit = BinNum % 10;  //To get lastdigtit from actual number.
            decimalNum = decimalNum + (LastDigit * (int) Math.pow(2, power));  //Here typrconversion is used as powfunction return double datatype answer. But we want as int.
            power++;
            BinNum = BinNum / 10;  //To removes the lastdigtit from actual Number.
        }
        System.out.println("Decimal of " + MyNum + " is " + decimalNum);  
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal Number: ");
        int Num = sc.nextInt();   
        BinaryToDecimal(Num);          
    }    
}