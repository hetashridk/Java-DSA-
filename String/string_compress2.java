public class string_compress2 {
    public static String compressB(String str){
        StringBuilder sb = new StringBuilder("");
            char ch = str.charAt(0);
            
            for(int  i = 1; i < str.length(); i++){
                Integer count = 1;
                while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                    count++;
                    i++;
                }
                sb.append(str.charAt(i));
                if(count > 1){
                    sb.append(count.toString());
                }
            }
            return sb.toString();

        
    }
    public static void main(String args[]){
        String str = "aabbbbcdeee";
        System.out.println(compressB(str));
    }    
}