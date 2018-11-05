package lesson3;

/*
Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String text;
        LinkedHashSet<Character> temp = new LinkedHashSet<Character>();

        System.out.println("введите текст");
        text = in.nextLine();
        text = text.replace(" ", "");

        for (int i = 0; i < text.length(); i++) {
            if (temp.add(text.charAt(i))) {
                sb.append(text.charAt(i));
            }
        } System.out.println(sb);
    }
}
