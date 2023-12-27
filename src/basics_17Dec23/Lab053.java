package src.basics_17Dec23;
import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {

        //  A = x^2
        // B - y^2
        // c = |z| ->


        // You have to tell JVM which input user is enter
        // sc.next() ->  String;
        // sc.nextInt()
        // sc.nextDouble();
        // sc.nextBoolean();
        // sc.nextFloat();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the X");
        double x =sc.nextDouble();
        System.out.println("enter the Y");
        double y =sc.nextDouble();
        System.out.println("enter the Z");
        double z =sc.nextDouble();


        double result;
        //  3/ x^2 + y^2 - |z|
        //  A+B-C ->  A ->  x^2 , B -> Y ^2 , C ->  |Z| abs(Z)  -1 ->  1, -199.98 -> +199.98

        result =Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));

        System.out.println(result);

        sc.close();


    }

}
