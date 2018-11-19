package lesson11;

/*
Задача 15
Коллекция хранит фамилии человека и город проживания.
Считывая город с клавиатуры программа должна выводить фамилии  людей, живущих в данном городе.
 */

import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        Map<String,String> citizens = new LinkedHashMap<>();
        List<String> soname = new ArrayList<>();
        List<String> city = new ArrayList<>();

        soname.add(0, "Petrov");
        soname.add(1, "Vetrov");
        soname.add(2, "Getrov");
        soname.add(3, "Retrov");
        soname.add(4, "Sidorov");
        soname.add(5, "Netrov");
        soname.add(6, "Ketrov");
        soname.add(7, "Zetrov");
        soname.add(8, "Jetrov");
        soname.add(9, "Betrov");

        city.add(0, "NY");
        city.add(1, "LA");
        city.add(2, "Chikago");
        city.add(3, "Washington");
        city.add(4, "NY");
        city.add(5, "Kary");
        city.add(6, "NY");
        city.add(7, "LA");
        city.add(8, "SF");
        city.add(9, "NY");



        for (int  i = 0; i<10;i++) {
            citizens.put(soname.get(i), city.get(i));
        }

        System.out.println(citizens);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter city");
        String s = in.nextLine();

        for(Map.Entry<String,String> entry : citizens.entrySet()) {
            if (entry.getValue().matches(s)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
