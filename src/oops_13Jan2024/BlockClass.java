package src.oops_13Jan2024;

public class BlockClass {
    { // Instance Initialization Block
        System.out.println("I am IIB");
    }

    BlockClass(){
        System.out.println("I am DC");
    }

    static { // SIB Static Initialization Block
        System.out.println("I am SIB");
    }

}
