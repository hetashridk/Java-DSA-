public class logical {
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        int c = 11;
        System.out.println((a > b) && (a > c));
        System.out.println((a > b) || (a > c));
        System.out.println(!(a > b));
    }    
}