package patterns.Task4Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String data = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные");
        data = in.nextLine();

        Strategy first = new Strategy(new ConsoleLogger());
        Strategy second = new Strategy(new FileLogger());
        Strategy third = new Strategy(new TimeFileLogger());

        first.write(data);
        second.write(data);
        third.write(data);
    }
}
