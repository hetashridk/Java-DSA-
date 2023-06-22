public class practice_Q1 {
    public static int ratMaze(int i, int j, int n, int m){
        // base case
        if(i == n - 1 && j == m - 1){
            return 1;
        }
        // else if((i == 1 && j == 0) || (i == 1 && j == 2) || (i == 3 && j == 1)){
        //     return 0;
        // }
        else if(i == n || j == m){
            return 0;
        }
        // kaam

        // for left
        int w1 = ratMaze(i, j - 1, n, m);

        // for right
        int w2 = ratMaze(i, j + 1, n, m);

        // for up
        int w3 = ratMaze(i - 1, j, n, m);

        // for down
        int w4 = ratMaze(i + 1, j, n, m);

        return w1 + w2 + w3 + w4;
    }
    public static void main(String args[]){
        int n = 4;
        int m = 4;
        System.out.println("DSHefiol");
        System.out.println(ratMaze(0 ,0 , n, m));
    }    
}