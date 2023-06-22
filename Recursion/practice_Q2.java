public class practice_Q2 {

    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int num){

        // base case
        if(num == 0){
            return;
        }

        int lastDigit = num % 10;
        printDigits(num / 10);
        System.out.print(digits[lastDigit] + " ");
    }
    public static void main(String args[]){
        printDigits(5214);
    }    
}