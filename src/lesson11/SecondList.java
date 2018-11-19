package lesson11;

/*
Задача 2
Написать программу со следующим функционалом:
Считывание 20 чисел с клавиатуры,
сохранение их в список,
сортировка по трём другим спискам:
число нацело делится на 3,
нацело делится на 2 и
все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.

Метод printList() должен выводить на экран все элементы всех списков с новой строки.
Метод printList(String listName) должен выводить на экран все элементы указанного списка
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SecondList {
    private static ArrayList<Integer> allNumbers = new ArrayList<>();
    private static ArrayList<Integer> numbers2 = new ArrayList<>();
    private static ArrayList<Integer> numbers3 = new ArrayList<>();
    private static ArrayList<Integer> numbersElse = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Введите числа");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            allNumbers.add(input.nextInt());
        }

        for (int i = 0; i < allNumbers.size(); i++) {
            if (allNumbers.get(i) % 2 == 0 && allNumbers.get(i) % 3 == 0) {
                numbers2.add(allNumbers.get(i));
                numbers3.add(allNumbers.get(i));
            } else if (allNumbers.get(i) % 2 == 0) {
                numbers2.add(allNumbers.get(i));
            } else if (allNumbers.get(i) % 3 == 0) {
                numbers3.add(allNumbers.get(i));
            } else {
                numbersElse.add(allNumbers.get(i));
            }
        }

        SecondList.printList();
        System.out.println("Введите название листа");
        Scanner in = new Scanner(System.in);
        SecondList.printList(in.nextLine());
    }

    public static void printList() {
        for (int i = 0; i < numbers2.size(); i++) {
            System.out.println(numbers2.get(i));
        }
        for (int i = 0; i < numbers3.size(); i++) {
            System.out.println(numbers3.get(i));
        }
        for (int i = 0; i < numbersElse.size(); i++) {
            System.out.println(numbersElse.get(i));
        }
    }

    public static void printList(String listName) {
        if (listName.matches("numbers2")) {
            for (int i = 0; i < numbers2.size(); i++) {
                System.out.println(numbers2.get(i));
            }
        } else if (listName.matches("numbers3")) {
            for (int i = 0; i < numbers3.size(); i++) {
                System.out.println(numbers3.get(i));
            }
        } else if (listName.matches("numbersElse")) {
            for (int i = 0; i < numbersElse.size(); i++) {
                System.out.println(numbersElse.get(i));
            }
        }
    }
}
