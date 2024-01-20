package src.oops_6Jan2024.basics;

public class Lab114 {
    public static void main(String[] args) {
        // Immutable in nature (that can't changed)
        String password = "pass@123";

        // 1000 times I am going to change the password value
        // should I use the Sb, sb OR String

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Pramod");
        password2.append(" Dutta");
        System.out.println(password2);


    }
}
