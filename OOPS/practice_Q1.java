public class practice_Q1 {
    public static void main(String args[]){
        Complex c = new Complex();
        c.setNum(2,5);
        c.getdifferenceNum();
        c.getproductNum();
        c.getsumNum();
    }    
}

class Complex{
    int realNum;
    int imaginaryNum;

    void setNum(int realNum, int imaginaryNum){
        this.realNum = realNum;
        this.imaginaryNum = imaginaryNum;
    }

    void getsumNum(){
        System.out.println(realNum + " + " + imaginaryNum+"i");
    }
    void getproductNum(){
        System.out.println(realNum *  imaginaryNum+"i");
    }
    void getdifferenceNum(){
        System.out.println(realNum + " - " + imaginaryNum+"i");
    }
}