import java.util.*;
public class valid_parantheses {
    public static boolean validParantheses(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            // opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            // closing
            else{
                // if stack has only closing bracket then stack would be empty till now that is ')))}}}]]]'
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        String str = "[{()}]";
        System.out.print(validParantheses(str));
    }    
}