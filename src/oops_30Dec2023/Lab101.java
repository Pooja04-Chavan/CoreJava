package src.oops_30Dec2023;

public class Lab101 {
    public static void main(String[] ref_name) {
        System.out.println("Run fine!!");

        int d = main(10);
        System.out.println(d);
        main("Pramod");

    }

    static void main(String a){
        System.out.println("I am a Main function but JVM doesn't recognize me");
    }

    static int main(int a){
        return a+101;
    }

}
