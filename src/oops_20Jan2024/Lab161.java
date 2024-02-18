package src.oops_20Jan2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab161 {
    public static void main(String[] args) {
        String path = "C:/a.txt";
        try {
            FileInputStream f = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
