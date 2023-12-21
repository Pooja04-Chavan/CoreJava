package src.basics_16Dec23;

public class Lab023 {

    public static void main(String[] args) {

        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
        String name2 = new String("The Testing academy"); // Heap area
//
//        System.out.println(name == name1);
//        System.out.println(name.equals(name1));


//        System.out.println(name == name2);

        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));


        String str1="Hello";
        String str2=" Guys";
        String str3="Hello Guys";

        String str4= str1.concat(str2);


    }
}
