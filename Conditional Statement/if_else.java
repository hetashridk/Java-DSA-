public class if_else {
    public static void main(String args[]){
        int age = 16;
        if(age > 18){
            System.out.println("Adult: drive");
        }

        if (age > 13 && age < 18){
            System.out.println("teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }    
}