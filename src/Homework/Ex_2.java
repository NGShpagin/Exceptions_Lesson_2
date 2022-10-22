package Homework;

/*
Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */

public class Ex_2 {
    public static void main(String[] args) {
        //#region Variant_1 (if-else)
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,9}; // инициализация массива
        double d = 2;
        int index = 5;
        double catchedRes1;
        if (d == 0) {
            System.out.println("Divide by zero is impossible (d = 0)");
        } else if (index > intArray.length-1) {
            System.out.println("Index out of bounds");
        } else {
            catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);;
        }
        //#endregion

        //#region Variant_2 (try-catch)
//        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,9}; // инициализация массива
//        try {
//            double d = 6; // всегда деление на 0
//            double catchedRes1 = intArray[8] / d; // индекс
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException
//            System.out.println("Catching exception: " + e);
//        }
        //#endregion
    }
}


