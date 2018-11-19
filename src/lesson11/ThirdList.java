package lesson11;

/*
Задача 3
Написать программу со следующим функционалом:
Считывание  с клавиатуры 10 слов в список строк.
Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
Метод printList()  должен выводить результат на экран (каждое значение с новой строки).
 */


import java.util.ArrayList;
import java.util.Scanner;

public class ThirdList {
    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.ensureCapacity(20);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(in.nextLine());
        }
        ThirdList.doubleValues(list);
        ThirdList.printList(list);
        System.out.println(list.size());
    }

    public static void doubleValues (ArrayList<String> list) {
        for (int i = 0; i<10; i+=2) {
            list.set(i+1, list.get(i));
        }
    }
    public static void printList (ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

}
