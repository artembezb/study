package lesson4.Figures;

/*
1. Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты.
Все фигуры должны иметь методы, которые возвращают площадь и периметр (для окружности - длина окружности).
 */

import lesson4.Figures.Circle;
import lesson4.Figures.Rectangle;
import lesson4.Figures.Triangle;

public class Main {
    public static void main(String[] args) {
//        Circle circle1 = new Circle();
//        circle1.pointCenter();
//        circle1.pointCircle();
//        circle1.radius();
//        circle1.circleLenght();
//        circle1.circleArea();
//
//
//        Triangle triangle1 = new Triangle();
//        triangle1.pointA();
//        triangle1.pointB();
//        triangle1.pointC();
//        triangle1.triangleLenght();
//        triangle1.triangleArea();

        Rectangle rectangle1 = new Rectangle();
        rectangle1.pointA();
        rectangle1.pointB();
        rectangle1.pointC();
        rectangle1.pointD();
        rectangle1.rectangleLenght();
        rectangle1.rectangleArea();
    }
}
