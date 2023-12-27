package src.basics_23Dec;

import java.util.Scanner;
public class Lab055 {

    public static void main(String[] args) {

        // Take a user input and print the information
        // You have to tell JVM which input user is enter
        // sc.next() ->  String;
        // sc.nextInt() -> Integer
        // sc.nextDouble(); -> double
        // sc.nextBoolean(); -> boolean
        // sc.nextFloat(); -> float

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = user_input.next();

        System.out.println("Enter your age");
        int age = user_input.nextInt();

        System.out.println("Enter your Salary");
        double salary = user_input.nextDouble();

        System.out.println("Your details are " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your Salary is " + salary);

        user_input.close();










    }
    
}
