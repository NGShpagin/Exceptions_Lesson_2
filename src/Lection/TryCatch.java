package Lection;

import java.util.Collections;

public class TryCatch {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
//            System.out.println(test.length());
            Collections.emptyList().add(new Object());
        } catch (ArithmeticException e) {
            System.out.println("Operation, devided by zero, not supported");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println(number);
    }
}
