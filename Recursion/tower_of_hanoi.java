import java.util.*;
public class tower_of_hanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest){     //src = source, dest = destination
        // base case
        // step - 2
        if (n == 1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest + ".");
            return;
        }

        // step - 1
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest + ".");

        // step - 3
        towerOfHanoi(n - 1, helper, src, dest);
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");                 
        int n = sc.nextInt();
        towerOfHanoi(n, "S", "H", "D");
    }    
}