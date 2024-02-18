package src.oops_14Jan2024.innerclass;

public class Lab142 {
    public static void main(String[] args) {

        Thread t=  new Thread(){
            @Override
            public void run(){
                System.out.println("I am a THREAD!");
            }
        };
        t.run();


    }
}
