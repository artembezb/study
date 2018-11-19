package lesson11;

/*
Задача 9
Создать Map<String, Integer> и внести в него десять записей по принципу: «фамилия» - «зарплата».
Удалить из всех людей, у которых зарплата ниже введенного с клавиатуры числа
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Map<String, Integer> zp = new LinkedHashMap<>();
        zp.put("1", 100000);
        zp.put("2", 200000);
        zp.put("3", 300000);
        zp.put("4", 400000);
        zp.put("5", 500000);
        zp.put("6", 600000);
        zp.put("7", 700000);
        zp.put("8", 800000);
        zp.put("9", 900000);
        zp.put("10", 450000);
        zp.put("11", 360000);
        zp.put("12", 370000);

        System.out.println(zp);
        Scanner in = new Scanner(System.in);
        System.out.println("Input value");
        Integer min = in.nextInt();
        Map<String, Integer> zp1 = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : zp.entrySet()) {
            if(entry.getValue()>=min) {
                zp1.put(entry.getKey(),entry.getValue());
            }
        }
        System.out.println(zp1);
    }
}
