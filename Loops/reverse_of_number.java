public class reverse_of_number {
    public static void main(String args[]){
        int n =  487326589;
        while (n > 0){
            int lastdigit = n % 10;  //To get the last digit.
            System.out.print(lastdigit);
            n = n / 10;  //To remove the digit.
        }
    }    
}