public class function_overloading_using_parameters {
    public static int summ(int a, int b){
        return a + b;
    }
    public static int summ(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String args[]){
        System.out.println(summ(2,3));
        System.out.println(summ(5,7,4));
    }    
}