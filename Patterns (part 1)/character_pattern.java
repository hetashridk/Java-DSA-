public class character_pattern {
    public static void main(String args[]){
        int n = 4;
        char ch = 'A';

        //Numbers of rows/lines has to be print.
        for(int i = 1; i <= n; i++){

            //Numbers of char has to be print.
            for(int charr = 1; charr <= i; charr++){  
                                                      
                //What to print.                      
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }    
}