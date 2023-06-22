public class function_overloading_using_datatype{
    public static int summ(int a, int b){
        return a + b;
    }
    public static float summ(float a, float b){
        return a + b;
    }
    public static void main(String args[]){
        System.out.println(summ(2,3));
        System.out.println(summ(5.1f,7.4f));
    }   
}