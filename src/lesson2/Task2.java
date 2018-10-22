package lesson2;
/*Задача 2
Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 …. */


public class Task2 {
    public static void main(String[] args) {
        int count = 90;
        while (count >= 0) {
            System.out.println(count);
            count -= 5;
        }

    }
}
