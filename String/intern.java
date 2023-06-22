public class intern {
    public static void main(String args[]){
        String str1 = new String("Hetashri").intern();
        String str2 = new String("Hetashri");
        String str3 = "Hetashri".intern();

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }    
}