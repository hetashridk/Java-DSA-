public class subset {
    public static void findSubset(String str, String ans, int i){

        // base case
        if(i == str.length()){

            // to print null
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        // kaam(recursion)

        // choice for yes
        findSubset(str, ans + str.charAt(i), i + 1);

        // choice for no
        findSubset(str, ans, i + 1);
    }
    public static void main(String args[]){
        String str = "abc";
        findSubset(str, "", 0);
    }    
}