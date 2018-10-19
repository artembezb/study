package lesson1;

public class Task4 {
    public static void main(String[] args) {
        double m;
        double n;
        n = 8.67;
        m = 11.24;
        double res1;
        double res2;
        double res;
        res1 = Math.abs(10-n);
        res2 = Math.abs(10-m);
        res = res1 < res2 ? n : m;
        System.out.println(res);

    }
}
