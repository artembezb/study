package lesson3;

/*
Задача 3
Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int count = 0;
        int[] array;
        array = new int[15];
        for (int i = 0; i < array.length; i++) {
            Random fill = new Random();
            array[i] = fill.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i]%2 == 0) {
                count++;
            }
        }
        System.out.print("\n" + count);
    }
}
