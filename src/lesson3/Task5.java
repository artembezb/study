package lesson3;

/*
1) Найти в строке указанную подстроку и заменить ее на новую.
Строку, ее подстроку для замены и новую подстроку вводит пользователь.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        System.out.println("Введите искомую подстроку");
        Scanner in1 = new Scanner(System.in);
        String str2 = in1.nextLine();
        System.out.println("ВВедите подстроку для замены");
        Scanner in2 = new Scanner(System.in);
        String str3 = in2.nextLine();
        System.out.println(str1.replaceAll(str2,str3));


    }
}
