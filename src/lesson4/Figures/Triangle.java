package lesson4.Figures;

import java.util.Scanner;

public class Triangle {
    public double x, y;
    public double x1, y1;
    public double x2, y2;

    public void pointA() {
        System.out.println("Введите координаты точки A");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        y = in1.nextDouble();
    }

    public void pointB() {
        System.out.println("Введите координаты точки B");
        Scanner in = new Scanner(System.in);
        x1 = in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        y1 = in1.nextDouble();
    }
    public void pointC() {
        System.out.println("Введите координаты точки C");
        Scanner in = new Scanner(System.in);
        x2 = in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        y2 = in1.nextDouble();
    }
    public void triangleArea(){
        double s;
        s = 0.5*((x-x2)*(y1-y2)-(x1-x2)*(y-y2));
        System.out.println("Площадь треугольника равна " + s);
    }
    public void triangleLenght(){
        double c;
        double ab;
        double ac;
        double bc;
        ab = Math.sqrt((Math.pow((x1-x),2))+ (Math.pow((y1-y),2)));
        ac = Math.sqrt((Math.pow((x2-x),2))+ (Math.pow((y2-y),2)));
        bc = Math.sqrt((Math.pow((x2-x1),2))+ (Math.pow((y2-y1),2)));
        c = ab + bc +ac;
        System.out.println("Периметр треугольника равен " + c);
    }

}
