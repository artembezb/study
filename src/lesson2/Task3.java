package lesson2;
/*Задача 3*
Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 …. */

public class Task3 {
    public static void main(String[] args) {
        int i = 1;
        long n = 2;
        while (i <=20) {
            System.out.println(n);
            n = n*2;
            i++;
        }

    }
}
