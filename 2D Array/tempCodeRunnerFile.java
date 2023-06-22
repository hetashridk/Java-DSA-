public class practice_Q1 {
    public static void count(int matrix[][]){
        int i = 0, j = 0;
        int count = 0;
        while(i < matrix.length && j < matrix[0].length){
            if(matrix[i][j] == 7){
                count = count + 1;
            }
        }
        System.out.println("7's is : " + count);
    }
    public static void main(String args[]){
        int matrix[][] = {{4, 7, 8},
                          {8, 8, 7}};
        
        count(matrix);
        System.out.println("yes11");
    }    
}