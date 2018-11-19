package lesson11;

import java.util.*;

public class Task16 {
    static List<String> list = new LinkedList<>();
    static Scanner in = new Scanner(System.in);

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        for (int i = 0; i<10;i++ ) {
            list.add(i,in.nextLine());
        }
        System.out.println(list.get(0));
        Map<String, Integer> spis = new LinkedHashMap<>();
        int count = 1;
        for(int i = 0; i <list.size()-1;i++) {
            for(int j = 1; j <list.size();j++)
                if (list.get(j).matches(list.get(i))) {
                    count++;
                    continue;
                } else {
                    continue;
                }
            spis.put(list.get(i), count);

        }

        System.out.println(spis);
    }
}

