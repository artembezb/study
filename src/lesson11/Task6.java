package lesson11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Input N");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Input M");
        int m = in.nextInt();

        List<String> list = new LinkedList<>();
        System.out.println("Input Strings");
        for (int i = 0; i < n; i++) {
            list.add(i, in.nextLine());
        }
        for (int i = 0; i < m; i++) {
            ((LinkedList<String>) list).addLast(list.get(i));
            list.remove(i);
        }
        for(String s : list) {
            System.out.println(s);
        }
    }
}
