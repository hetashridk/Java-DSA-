public class ClimbingStairsRecursive {

    public static int climbingStairsRecursive(int n){   //TC:- O(2^n)
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        return climbingStairsRecursive(n - 1) + climbingStairsRecursive(n - 2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbingStairsRecursive(n));
    }
}
