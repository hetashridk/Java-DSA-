public class practice_Q1 {
    public static String vowel(String str){
        StringBuilder sb = new StringBuilder("");
        Character ch = str.charAt(0);

        Integer count = 0;
        for(int i = 1; i < str.length(); i++){
            while(str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e' && i < str.length() - 1){
                count++;
                i++;
            }
        }
        return count.toString();
    }
    public static void main(String args[]){
        String str = "Hi i Am hetashri ";
        System.out.println(vowel(str));
    }    
}