public class practice_Q2 {
    public static void main(String args[]){
        int x = 3;
        int y = 4;
        System.out.println("Before swapping x = " + x + " and y = " + y);

        // swap using XOR
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swapping x = " + x + " and y = " + y);
    }    
}