public class practice_Q4 {
    public static void anagrams(String str1, String str2){
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");

        Character ch1 = str1.charAt(0);
        Character ch2 = str2.charAt(0);

        if(str1.length() == str2.length()){

            for(int i = 1; i < str1.length(); i++){
                for(int j = 1; j < str2.length(); j++){

                    while(str1.charAt(i) == str2.charAt(j)){
                        System.out.println(str1 + " and " + str2 +  " are anagrams.");
                        break;
                    }
                }
            }    
        }
    }
    public static void main(String args[]){
        String str1 = "care";
        String str2 = "race";
        anagrams(str1, str2);
    }    
}