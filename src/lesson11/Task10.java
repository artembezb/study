package lesson11;

/*
Задача 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        Set<Integer> count = new HashSet<>();
        count.add(1);
        count.add(2);
        count.add(3);
        count.add(4);
        count.add(5);
        count.add(6);
        count.add(7);
        count.add(8);
        count.add(9);
        count.add(10);
        count.add(11);
        count.add(12);
        count.add(13);
        count.add(14);
        count.add(15);
        count.add(16);
        count.add(17);
        count.add(18);
        count.add(19);
        count.add(20);
        Iterator<Integer> iter = count.iterator();
        while(iter.hasNext()) {
            if(iter.next() > 10) {
                iter.remove();
            }
        }
        System.out.println(count);
    }
}
