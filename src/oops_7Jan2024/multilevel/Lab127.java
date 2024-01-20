package src.oops_7Jan2024.multilevel;

public class Lab127 {
    public static void main(String[] args) {
//        GrandFather g = new GrandFather();
//        Father f = new Father();
//        Son s = new Son();
//
//
//        GrandFather g = new Son();// parent can create child object
//
//
//        Father f = new Son();
//        // Son s  = new GrandFather();//child cannot create parent object
//        // Son s = new Father();
//        Son s = new Son();

        GrandFather g = new Son();
        g.bhk3();

        Son s = new Son();
        s.bhk1();
        s.bhk2();
        s.bhk3();



    }
}
