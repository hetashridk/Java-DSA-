// We are giveb an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000]. Find minimum number of coins/notes to make a chnage for a amount/ value v
import java.util.*;
public class indian_coin {
    public static void main(String args[]){
        Integer coin[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        // to sort in descending order
        Arrays.sort(coin, Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();

        int countOfCoins = 0;
        int amount = 5654;

        for(int i = 0; i < coin.length; i++){
            if(coin[i] <= amount){
                while(coin[i] <= amount){
                    countOfCoins++;
                    ans.add(coin[i]);
                    amount -= coin[i];
                }
            }
        }
        System.out.println("total number of minimum coin/note is: " + countOfCoins);

        // to print specific coin/note
        System.out.print("Notes/coin which is being used are: ");
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }    
}