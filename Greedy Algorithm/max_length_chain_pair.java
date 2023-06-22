// you are given n pairs of numbers. In every pair, the first number is always smaller than the 2nd number. A pair (c,d) can come after (a,b) if b < c. Find the longest chain which can be formed from a given set of pairs.
import java.util.*;
public class max_length_chain_pair {
    public static void main(String args[]){
        int pair[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int chainlen = 1;
        int lastSelectedEnd = pair[0][1];

        for(int i = 1; i < pair.length; i++){
            if(lastSelectedEnd < pair[i][0]){
                chainlen++;
                lastSelectedEnd = pair[i][1];
            }
        }
        System.out.print("Maximum chain length is: " + chainlen);
    }    
}
