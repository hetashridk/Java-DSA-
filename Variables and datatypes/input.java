import java.util.*;
public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Used to give one word input.
        String h = sc.next();
        System.out.println(h);

        //Used to give multiword input.
        String Name = sc.nextLine();
        System.out.println(Name);
        
        //Used to give integer input.
        int age = sc.nextInt();
        System.out.println(age);

        //Used to give byte input.
        byte b = sc.nextByte();
        System.out.println(b);

        //Used to give float input.
        float f = sc.nextFloat();
        System.out.println(f);

        //Used to give double input.
        double d = sc.nextDouble();
        System.out.println(d);

        //Used to give boolean input.
        boolean var = sc.nextBoolean();
        System.out.println(var);

        //Used to give short input.
        short s = sc.nextShort();
        System.out.println(s);

        //Used to give long input.
        long l = sc.nextLong();
        System.out.println(l);


    }    
}