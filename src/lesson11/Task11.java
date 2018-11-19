package lesson11;

/*
Задача 11
Создать два списка – LinkedList и ArrayList.
Для этих списков  провести 10 тысяч вставок, удалений, а также вызовов get и set.
То есть класс должен содержать перечисленные методы:
insert10000(List list) должен вставлять 10 тысяч элементов в список.
get10000(List list) должен вызывать 10 тысяч раз get у списка.
set10000(List list) должен вызывать 10 тысяч раз set у списка.
remove10000(List list) должен удалять 10 тысяч элементов из списка.

Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeOfInsert() должен вернуть время выполнения в миллисекундах для каждого списка.
 */


import java.util.*;

public class Task11 {
    static List list1 = new LinkedList();
    static List list2 = new ArrayList();

    public List getList1() {
        return list1;
    }

    public List getList2() {
        return list2;
    }

    public void setList1(List list1) {
        this.list1 = list1;
    }

    public void setList2(List list2) {
        this.list2 = list2;
    }

    public static void insert1000(List list) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(random.nextInt());
        }
        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Working time " + timeWorkCode);
    }
    public static void get1000(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Working time " + timeWorkCode);
    }
    public static void set1000(List list) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            list.set(i, random.nextInt());
        }
        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Working time " + timeWorkCode);
    }
    public static void remove1000(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Working time " + timeWorkCode);
    }

    public static void main(String[] args) {
        Task11.insert1000(list1);
        Task11.insert1000(list2);
        Task11.get1000(list1);
        Task11.get1000(list2);
        Task11.set1000(list1);
        Task11.set1000(list2);
        Task11.remove1000(list1);
        Task11.remove1000(list2);
    }

}
