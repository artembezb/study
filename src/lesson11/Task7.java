package lesson11;

/*
Задача 7
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
Результат вывести на экран
 */


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task7 {
    public static void main(String[] args) {
        Map<String, String> spisok = new LinkedHashMap<>();
        spisok.put("Petrov", "Vasya");
        spisok.put("Vetrov", "Dasya");
        spisok.put("Zetrov", "Masya");
        spisok.put("Retrov", "Pasya");
        spisok.put("Petrov", "Vasya");
        spisok.put("Petrov", "Tasya");
        spisok.put("Fetrov", "Fasya");
        spisok.put("Getrov", "Gasya");
        spisok.put("Netrov", "Nasya");
        spisok.put("Metrov", "Vasya");
        System.out.println(spisok);

        for(int i = 0; i < spisok.size();i++) {
            if (spisok.containsKey("Petrov") && spisok.containsValue("Vasya")) {
                System.out.println(i + spisok.get(i));
            }
        }
    }
}
