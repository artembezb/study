package lesson4.Figures;

import java.util.Scanner;

public class Rectangle {
    public double x, y;
    public double x1, y1;
    public double x2, y2;
    public double x3, y3;

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
    public void pointD() {
        System.out.println("Введите координаты точки D");
        Scanner in = new Scanner(System.in);
        x3 = in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        y3 = in1.nextDouble();
    }
    public void rectangleLenght(){
        double c;
        double ab;
        double bc;
        double cd;
        double ad;

        ab = Math.sqrt((Math.pow((x1-x),2))+ (Math.pow((y1-y),2)));
        bc = Math.sqrt((Math.pow((x2-x1),2))+ (Math.pow((y2-y1),2)));
        cd = Math.sqrt((Math.pow((x3-x2),2))+ (Math.pow((y3-y2),2)));
        ad = Math.sqrt((Math.pow((x3-x),2))+ (Math.pow((y3-y),2)));
        c = ab + bc +cd + ad;
        System.out.println("Периметр четырехугольника равен " + c);
    }
    public void rectangleArea(){
        double s;
        s = 0.5*((x*y1 - y*x1)+(x1*y2 - y1*x2) + (x2*y3 - y2*x3) + (x3*y - y3*x));
        System.out.println("Площадь четырехугольника равна " + s);
    }
}
