package lesson2;

/*
Задача 8*
Есть три вершины X, Y, Z.
Их координаты (x1, x2), (y1, y2), (z1, z2) заданы как целые числа.
Нужно определить - является ли треугольник с заданными координатами прямоугольным.
 */

public class Task8 {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 4;
        int y1 = 2;
        int y2 = 5;
        int z1 = 7;
        int z2 = 5;
        if (x1 == y1 && y2 == z2) {
            System.out.println("Треугольник прямоугольный");
        } else if (y1 == z1 && z2 == x2) {
            System.out.println("Треугольник прямоугольный");
        } else if (z1 == x1 && x2 == y2) {
            System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Треугольник не прямоугольный");
        }

    }
}
