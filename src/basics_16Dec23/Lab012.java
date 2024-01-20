package src.basics_16Dec23;

public class Lab012 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println(a+b); // 55

        String name = "Pramod";
        System.out.println(a+name); //10Pramod

        System.out.println(name+a); // Pramod10
        // Interview - left -> right

        // Concatenation - String + other
        System.out.println(a+b+name); //55Pramod

        // All the + below are concatenation
        System.out.println(name+a+b); //Pramod1045
    }
}
