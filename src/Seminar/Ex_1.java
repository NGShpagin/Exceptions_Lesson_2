package Seminar;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int index = 0;
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        if (scanner.hasNextInt()) index = scanner.nextInt();
        if (index > arr.length-1) System.out.println("Указан индекс за пределами массива");
        else arr[index] = 1;
//        try {
//            arr[index] = 1;
//        } catch (Exception e) {
//            System.out.println("Указан индекс за пределами массива");
//        }
    }
}
