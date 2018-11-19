package lesson11;

/*
Задача 1
Написать программу со следующим функционалом:
Считывание максимум 5 строк с клавиатуры,
занесение строк в список,
поиск самой короткой строки,
вывод самой короткой строки на экран по запросу пользователя (команда в консоле /short string)
Если одинаково коротких строк несколько, выводить каждую с новой строки.
 */

import java.util.*;

public class FirstList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(in.nextLine());
        }
        for (String s : list) {
            System.out.println(s);
        }
        searchMin(list);
    }

    public static void searchMin(ArrayList<String> list) {
        System.out.println("Введите команду");
        Scanner kom = new Scanner(System.in);
        if (kom.nextLine().matches("short string")) {
        list.sort(Comparator.comparing(String::length));
            ArrayList<String> listNew = list;
            System.out.println(listNew);
            for (int i = 0; i < listNew.size()-1; i++) {
                if (listNew.get(0).length()<listNew.get(i + 1).length()) {
                    System.out.print(listNew.get(0));
                    break;
                } else if (listNew.get(0).length()==listNew.get(i + 1).length()) {
                    System.out.println(listNew.get(i+1));
                }
            }
        } else {
            System.out.println("Команда не найдена");
        }
    }
}


