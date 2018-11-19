package lesson11;

/*
Задача 14
Написать программу, которая считывает с клавиатуры имя месяца и выводит его номер на экран в виде: «Май 5 месяц».
Использовать коллекции.
 */


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Map<Integer, String> month = new LinkedHashMap<>();
        month.put(1, "January");
        month.put(2, "Febrary");
        month.put(3, "Mach");
        month.put(4, "April");
        month.put(5, "May");
        month.put(6, "June");
        month.put(7, "July");
        month.put(8, "August");
        month.put(9, "September");
        month.put(10, "October");
        month.put(11, "November");
        month.put(12, "December");

        Scanner in = new Scanner(System.in);
        System.out.println("Input name");
        String s = in.nextLine();
        for (Map.Entry<Integer, String> entry : month.entrySet()) {
            if(entry.getValue().matches(s)) {
                System.out.println(entry.getValue() + " " + entry.getKey() + " " + "month");
                break;
            } else {
                continue;
            }
        }
    }
}
