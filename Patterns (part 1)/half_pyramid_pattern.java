public class half_pyramid_pattern {
    public static void main(String args[]){
        int n = 4;

        //How many rows/Lines has to print.
        for(int i = 1; i <= 4; i++){

            //Number of char has to be print.
            for(int num = 1; num <= i; num++){

                //What to print.
                System.out.print(num);
            }
            System.out.println();
        }
    }    
}