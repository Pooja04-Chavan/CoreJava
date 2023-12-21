package src.basics_16Dec23;

public class Lab016 {

    public static void main(String[] args) {

        //Logical operator
        // || - OR
        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F


        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        //  And  &&

        // T && T -> T
        // T && F -> F
        // F && T -> F
        // F && F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // ! -> Not , with boolean or condition
        boolean a = true;
        System.out.println(a);
        System.out.println(!a);
        System.out.println( !(10>20));
        System.out.println(!(30>90));

        int a1 = 12;
        boolean b = !(a1 > 10 || a1 < 5);
        System.out.println(b);

        int a2 = 67;
        boolean b1 = !(a2 > 20 && a2 < 78);
        System.out.println(b1);




    }
}
