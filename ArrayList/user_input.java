import java.util.*;
public class user_input {
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many element you want in array: ");                 
        int n = sc.nextInt();
        System.out.println("Enter element of array");
        for(int i = 0; i < n; i++){
            int j = sc.nextInt();
            List.add(j);
        }

        for(int i = 0; i < List.size(); i++){
            System.out.print(List.get(i));
        }
    }    
}