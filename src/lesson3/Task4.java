package lesson3;

/*
Задача 4*
Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного
размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше:
левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число,
то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.
 */

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четное положительное число");
        if (in.hasNextInt()) {
            int count = in.nextInt();
            if (count % 2 != 0) {
                System.out.println("Введенное число не подходит, введите новое значение");
                count = in.nextInt();
            } else if (count > 0) {
                int left = 0;
                int rigth = 0;
                int a = -5;
                int b = 5;
                int[] array;
                array = new int[count];
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (Math.random() * (b - a) + a);
                    System.out.print(array[i] + " ");
                }
                for (int i = 0; i < array.length; i++) {
                    if (i <= array.length / 2) {
                        left += Math.abs(array[i]);
                    } else {
                        rigth += Math.abs(array[i]);
                    }
                }
                if (left < rigth) {
                    System.out.println("Правая половина больше");
                } else if (left > rigth) {
                    System.out.println("Левая половина больше");
                } else {
                    System.out.println("Половины равны");
                }
            }
            }
        else {
            System.out.println("Введено не числовое значение");
        }
    }
}

