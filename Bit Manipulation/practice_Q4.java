public class practice_Q4 {
    public static void main(String args[]){

        // Convert uppercase to lowercase
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print((char)(ch | ' '));
        }
    }    
}