package src.oops_6Jan2024.basics;

public class Lab112 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        String s2 = new String("Pramod");
        String s3 = new String("pramod");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        System.out.println(s1.equalsIgnoreCase(s3));




    }
}
