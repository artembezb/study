package lesson11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ForthList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        System.out.println("input");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<5; i++) {
            list.add(i,in.nextLine());
        }
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

        for (int i = list.size()-1; i >=0; i--) {
            System.out.println(list.get(i));
        }
    }
}
