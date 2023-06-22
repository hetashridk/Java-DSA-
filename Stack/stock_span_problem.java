import java.util.*;
public class stock_span_problem {

    public static void stockspan(int stocks[], int span[]){

        // make a stack
        Stack<Integer> s = new Stack<>();

        // by default span of 1st day/0th index is 1
        span[0] = 1;
        s.push(0);

        for(int i = 1; i < stocks.length; i++){
            int currprice = stocks[i];

            // compare currprice/element with all element
            while(!s.isEmpty() && currprice > stocks[s.peek()]){
                s.pop();
            }
            // if after by above process check if stack is empty or not
            if(s.isEmpty()){
                span[i] = i + 1;
            } 
            else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }
    public static void main(String args[]){
        int stocks[]= {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockspan(stocks, span);

        // to print span
        for(int i = 0; i < span.length; i++){
            System.out.print(span[i] + " ");
        }
    }    
}