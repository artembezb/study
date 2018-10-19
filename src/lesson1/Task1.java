package lesson1;

public class Task1 {

    public static void main(String[]args){
        double length;
        double width;
        double heigth;
        length = 12;
        width = 3;
        heigth = 5;
        double area;
        area = 2*(length*width + width*heigth + length*heigth);
        System.out.println(area);

        double res;
        res = width > heigth ? width : heigth;
        System.out.println(res);


    }
}
