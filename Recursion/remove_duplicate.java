public class remove_duplicate {
    public static void removeDuplicate(String str, int index, StringBuilder newStr, boolean map[]){
        // base case
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        // kaam
        // get character
        char currChar = str.charAt(index);

        if(map[currChar - 'a'] == true){

            // then is is duplicate means that is already present in String
            removeDuplicate(str, index + 1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicate(str, index + 1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str = "apnnaacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }    
}