public class grid_ways {
    public static int gridWays(int i, int j, int n, int m){

        // base case
        // if we are at destination only
        if(i == n - 1 && j == m - 1){
            return 1;
        }
        // if we are going out/cross of the boundary
        else if(i == n || j == n){
            return 0;
        }


        // kaam
        // for down
        int w1 = gridWays(i + 1, j, n, m);

        // for right
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }
    public static void main(String args[]){
        int n = 3;
        int m = 4;
        System.out.println("Total number of grid ways is: " + gridWays(0, 0, n, m));
    }    
}