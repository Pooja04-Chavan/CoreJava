package src.oops_7Jan2024;

public class Person {
    String name;

    Person(){
        System.out.println("DC"); // Default Constructor
    }
    Person(String ref_name){
        this.name = ref_name;
    }

    Person(String ref_name,String age){
        this.name = ref_name;
    }

    Person(String ref_name,String age, int rollNo){
        this.name = ref_name;
    }

    void printDetail(){
        System.out.println("Your Name is -> " + this.name);
    }

    void printDetail(String name){
        System.out.println("Your Name is -> " + this.name);
    }

    int printDetail(int a){
        System.out.println("Your Name is -> " + this.name);
        return 99;
    }
}
