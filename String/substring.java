import java.util.*;
public class substring {
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int  i = si; i < ei; i++){
            substr += str.charAt(i);

        }
        return substr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");   
        String str = sc.nextLine(); 

        System.out.print("Enter the start index: ");
        int si = sc.nextInt();

        System.out.print("Enter the end index: ");
        int ei = sc.nextInt();

        System.out.println(subString(str, si, ei));


        System.out.println("------------------------------------------------------------------------------------------------");

        // Using function
        System.out.println(str.substring(0, 5));
    }
                      
}