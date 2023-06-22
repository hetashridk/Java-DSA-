public class find_permutation {
    public static void findPermutation(String str, String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // kaam
        for(int i = 0; i < str.length(); i++){

            // store the current character/element in curr
            char curr = str.charAt(i);

            // to remove string
            // if string str1 = abcdef... and have to remove c we store str1 = ab + def.... then automatically c will get remove
            // below i is excluded, n - 1 (str.length()) is also excluded (by default if will take n - 1)
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans + curr);

        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermutation(str, " ");
    }    
}