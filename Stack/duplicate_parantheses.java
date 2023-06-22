import java.util.*;
public class duplicate_parantheses {
    public static boolean duplicateParantheses(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            // closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop(); 
                    count++;
                }
                if(count < 1){
                    return true;
                }
                else{
                    // to pop out opening pair
                    s.pop();
                }
            }
            else{
                // opening
                s.push(ch);
            }
        }
        return false;

    }
    public static void main(String args[]){
        String str = "((a + b))";
        System.out.println(duplicateParantheses(str));
    }    
}