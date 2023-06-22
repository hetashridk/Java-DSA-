import java.util.*;
public class titling_problem {
    public static int tilingProblem(int n){
        // base case
        if(n == 0 || n == 1){
            return 1;
        }

        // kaam

        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizontal choice
        int fnm2 = tilingProblem(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.println("Number of ways: "+ tilingProblem(n));


    }    
}