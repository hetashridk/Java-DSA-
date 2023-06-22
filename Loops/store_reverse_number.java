public class store_reverse_number {
    public static void main(String args[]){
        int n = 973409;
        int reverse = 0;
        while (n > 0){
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n / 10;
        }
        System.out.println(reverse);
    }    
}