package Homework;

/*
Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */

public class Ex_2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,9}; // инициализация массива
        try {
            double d = 6; // всегда деление на 0
            double catchedRes1 = intArray[8] / d; // индекс
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException
            System.out.println("Catching exception: " + e);
        }
    }
}
