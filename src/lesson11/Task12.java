package lesson11;

/*
Задача 12
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими список.
Найти минимальное число среди элементов списка.
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Input N");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        for(int i = 0; i < n-1;i++) {
            if(list.get(i)<list.get(i+1)) {
                int x = list.get(i+1);
                list.set(i+1, list.get(i));
                list.set(i, x);
            } else {
                continue;
            }
        }
        System.out.println(((LinkedList<Integer>) list).getLast());
    }
}
