public class subset_using_strbuilder {
    public static void findSubset(String str, StringBuilder ans, int i){

        StringBuilder ans1 = new StringBuilder(" ");
        
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
        }
        ans = ans1;
        // kaam
        findSubset(str, ans.append(i), i + 1);
        findSubset(str, ans, i + 1);
        String newStr = ans.substring(0, i) + ans.substring(i + 1);
    }
    public static void main(String args[]){
    }    
}