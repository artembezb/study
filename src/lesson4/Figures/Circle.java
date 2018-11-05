package lesson4.Figures;

import java.util.Scanner;

public class Circle {
    public double x, y;
    public double x1, y1;

    public void pointCenter() {
        System.out.println("Введите координаты центра окружности");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        y = in1.nextDouble();
    }

    public void pointCircle() {
        System.out.println("Введите координаты точки окружности");
        Scanner in = new Scanner(System.in);
        x1 = in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        y1 = in1.nextDouble();
    }

    public double radius() {
        double r;
        r = Math.sqrt((Math.pow((x1 - x), 2)) + (Math.pow((y1 - y), 2)));
        return r;

    }

    public void circleLenght() {
        double c;
        c = Math.PI * 2 * radius();
        System.out.println("Длина окружности равна " + c);
    }

    public void circleArea() {
        double s;
        s = Math.PI * radius() * radius();
        System.out.println("Площадь круга равна " + s);
    }
}
