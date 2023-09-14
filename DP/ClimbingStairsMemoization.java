public class ClimbingStairsMemoization {

    public static int climbingStairsMemoization(int n, int ways[]){  //TC:- O(n)
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        ways[n] = climbingStairsMemoization(n - 1, ways) + climbingStairsMemoization(n - 2, ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        System.out.println(climbingStairsMemoization(n, ways));
    }
}
