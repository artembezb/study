package lesson1;

public class Task5 {
    public static void main(String[] args) {
        double rate;
        int term;
        double summ;
        double overpayment;
        rate = 0.085;
        term = 5;
        summ = 500000;

        overpayment = ((summ+(summ*rate*term))-summ);
        System.out.println(overpayment);
    }
}
