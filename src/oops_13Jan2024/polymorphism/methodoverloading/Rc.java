package src.oops_13Jan2024.polymorphism.methodoverloading;

import src.oops_13Jan2024.polymorphism.methodoverloading.Person;

public class Rc {
    public static void main(String[] args) {

        // Method Overloading
        // Load -> same name different
        new Person().Gift(1);
        new Person().Gift("pramod");
        new Person().Gift(3.14);

    }
}
