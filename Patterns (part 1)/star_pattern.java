public class star_pattern {
    public static void main(String args[]){

        //How many rows/Lines has to print.
        for(int line = 1; line <= 4; line++){

            //Numbers of times char has to be print.
            for(int star = 1; star <= line; star++){

                //What to print.
                System.out.print("*");
            }
            System.out.println("");
        }
    }    
}