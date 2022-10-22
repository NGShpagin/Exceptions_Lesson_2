package Lection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex_3 {
    public static void main(String[] args) {
        FileReader test = null;
        try {
             test = new FileReader("/Users/nikolaishpagin/Desktop/GeekBrains/Programmer_1st_quarter/Exceptions/Lesson_2/Lesson_2.iml");
//             test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("cath exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finished");
        }
    }
}
