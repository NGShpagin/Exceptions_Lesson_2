package Homework;

/*
Дан следующий код, исправьте его там, где требуется
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */

public class Ex_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 2); // здесь проверку на NullPointerException можно выполнить
            int[] abc = { 1, 2 };
            abc[1] = 9; // индекс, можно выполнить проверку на IndexOutOfBoundsException
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { // необходимо ставить вкоцне, чтобы сначала проверка пошла по первым двум
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) { // FileNotFoundException не нужен тут, работы с файлами нет
        System.out.println(a + b);
    }

}
