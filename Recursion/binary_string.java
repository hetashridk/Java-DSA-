public class binary_string {
    public static void printBinaryStr(int n, int lastPlace, String str){

        // base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        // kaam
        printBinaryStr(n - 1, 0, str + "0");
        if(lastPlace == 0){
            printBinaryStr(n - 1, 1, str + "1");
        }
    }
    public static void main(String args[]){
        printBinaryStr(3, 0, "");
    }    
}