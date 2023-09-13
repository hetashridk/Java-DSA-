public class FibonnaciTabulation{

    public static int fib(int n){
        int f[] = new int[n + 1];

        f[0] = 0;
        f[1] = 1;

        for(int i = 0; i <= n; i++){
            f[i] = f[i - 1] + f[i - 2];
            
        }

        
    }
    public static void main(String[] args) {
        int n = 6;
        int f[] = new int[n + 1];
        System.out.println(fib(n, f));
    }
}