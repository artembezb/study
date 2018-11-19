package lesson11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        System.out.println("input");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(i, in.nextLine());
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < list.get(i + 1).length()) {
                continue;
            } else {
                System.out.println("Error: " + list.get(i + 1));
                break;
            }
        }
    }
}
