package lesson3;

/*
Задача 1
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] number;
        number = new int[10];
        int k = 2;
        for (int i = 0; i < 10; i++) {
            number[i] = k;
            k += 2;
            System.out.print(number[i] + " ");
        }
        for (int num: number) {
            System.out.print( "\n" + num );
        }
    }
}


