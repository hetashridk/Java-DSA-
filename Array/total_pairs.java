public class total_pairs {
    public static void totalPair(int number[]){
        int totalpair = 0;
        for(int i = 0; i < number.length; i++){
            int currNum = number[i];      //2, 4, 6, 8, 10
            for(int j = i + 1; j < number.length; j++){
                System.out.print("(" + currNum + "," + number[j] + ")");
                totalpair++;
            }
            System.out.println();

        }
        System.out.print("Total pairs: " + totalpair);
    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10};
        totalPair(number);
    }    
}