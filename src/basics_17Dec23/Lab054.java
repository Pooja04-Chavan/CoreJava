package src.basics_17Dec23;

public class Lab054 {
    public static void main(String[] args) {

        char code = 'B';
        int val = switch (code) {
            case 'A' :
                yield 65;
            case 'B' :
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };

        System.out.println(val);


    }
}
