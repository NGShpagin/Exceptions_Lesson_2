package Homework;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        System.out.println(printFloat());
    }

    public static float printFloat() {
        float num = 0;
        boolean flag;
        do {
            flag = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a float number: ");
            try {
//                num = Float.parseFloat(scanner.nextLine());
                num = scanner.nextFloat();
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("This element is not a float.");
                flag = false;
            }
        } while (!flag);
        return num;
    }
}
