package lesson2;

/*
Задача 5
Выведите на экран первые 11 членов последовательности Фибоначчи.
Первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */

public class Task5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int k = 11;
        int n;
        for(int i = 0; i < k; i++){
            n = a + b;
            a = b;
            b = n;
            System.out.print(n + " ");
        }

    }
}
