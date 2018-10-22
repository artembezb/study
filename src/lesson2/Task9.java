package lesson2;

/*
Задача 9*
Задать количество тарелок и количество моющего средства.
Моющее средство расходуется из расчета 0,5 на одну тарелку.
В цикле выводить сколько моющего средства осталось после мытья каждой тарелки
В конце вывести, сколько тарелок осталось, когда моющее средство закончилось или наоборот.
 */

public class Task9 {
    public static void main(String[] args) {
        int plate = 30;
        float wash = 5;
        while (plate >= 0) {
            if (plate == 0 && wash > 0.5) {
                System.out.println("Тарелки кончились, " + "осталось " + wash + " моющего средства");
                break;
            } else if (wash >= 0.5) {
                wash -= 0.5;
                plate--;
                System.out.println("Осталось " + plate + " тарелок");
            } else {
                System.out.println("Средство кончилось, " + "осталось " + plate + " тарелок");
                break;
            }
        }
    }
}
