package Homework;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        System.out.println(printString());
    }

    public static String printString() {
        boolean flag;
        String string = null;
        do {
            flag = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string: ");
            string = scanner.nextLine();
            if (string.isEmpty()) {
                System.out.println("You need to print smth");
                flag = false;
            }
        } while (!flag);
        return string;
    }
}
