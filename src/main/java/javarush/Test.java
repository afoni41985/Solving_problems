package javarush;


import java.io.File;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        File file = new File("D:");
        for (File file1 : Objects.requireNonNull(file.listFiles())) {
            System.out.println(file1.getTotalSpace());
        }
    }
}
