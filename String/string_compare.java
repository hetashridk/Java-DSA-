public class string_compare {
    public static void main(String args[]){

        String s1 = "Hetashri";
        String s2 = "Hetashri";
        String s3 = new String("Hetashri");

        if(s1 == s2){
            System.out.println("string are equal.");
        }
        else{
            System.out.println("are not equal.");
        }

        if(s1 == s3){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal.");
        }

        System.out.println("------------------------------------------------------------------------------------------------");

        // using function.
        if(s1.equals(s3)){
            System.out.println("String are equal.");
        }
        else{
            System.out.println("String are not equal");
        }
    }    

}