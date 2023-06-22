// reverse string using stack
import java.util.*;
public class reverse_string {
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();

        // store Character/string in form of stack
        int index = 0;
        while(index < str.length()){
            s.push(str.charAt(index));
            index++;
        }


        // to reverse a string a make a "result"ant string to store it
        StringBuilder result = new StringBuilder("");

        // Character ne stack mathi bar khadiyu and string builder ma nakhiyu till stack is became empty
        while(!s.isEmpty()){
            // to store char which is pop out
            char curr = s.pop();
            // append that store char which is being pop out in result
            // by appending Character is now store in reverse fashion
            result.append(curr);

        }
        return result.toString();
    }
    public static void main(String args[]){
        String str = "hetashri";
        System.out.println(reverseStr(str));
    }    
}