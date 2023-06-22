public class inverted_star_pattern {
    public static void main(String args[]){
        int n = 4;

        //How many rows/Lines has to print.
        for(int i = 1; i <= n; i++){

            //Numbers of char has to be print.
            for(int star = 1; star <= (n - i + 1); star++){

                //What to print.
                System.out.print("*");
            }
            System.out.println("");
        }
    }    
}