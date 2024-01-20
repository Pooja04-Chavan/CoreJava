package src.oops_6Jan2024.basics;

public class Lab116 {
    public static void main(String[] args) {

        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


    }
}
