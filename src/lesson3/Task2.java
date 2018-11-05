package lesson3;

/*
Задача 2
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
а затем этот же массив выведите на экран тоже в строку,
но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int j = 0; j < 99; j++) {
            if ((j + 1) % 2 != 0) {
                count++;
            }
        } System.out.println(count);
        int[] number;
        number = new int[count];
        int k = 1;
        for (int i = 0; i < number.length; i++) {
            number[i] = k;
            k += 2;
            System.out.print(number[i] + " ");
        }
        for (int i = 0; i <= 49; i++) {
            System.out.print(number[49 - i] + " ");
        }

    }
}
