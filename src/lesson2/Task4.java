package lesson2;

/*
Задача 4
Проверьте, является ли натуральное число — простым.
 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        for ( int i=2; i < number; i++) {
            if ( number%i == 0) {
                System.out.println( "Число не является простым" );
                break;
            } else {
                System.out.println( "Число простое" );
                break;
            }
        }

    }
}
