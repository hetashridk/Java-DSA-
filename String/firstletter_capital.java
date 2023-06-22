public class firstletter_capital {
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1;i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length() - 1){     //i < str.length() - 1 is put because if the string has been ended.
                sb.append(str.charAt(i));   //To copy character of that string in sb.
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));     //convert the character at uppercase and copy that character in sb
            }
            else{
                sb.append(str.charAt(i));    //To copy character of that string in sb.
            }
        }
        return sb.toString();    //convert into string if there may be numeric.
    }
    public static void main(String args[]){
        String str = "hi, i am hetashri ";
        System.out.println(touppercase(str));
    }    
}