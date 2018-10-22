package lesson2;

/*
Задача 6*
В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
«Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например,
в билетах с номерами 003102 или 567576.
Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает,
как много сувениров потребуется.
С помощью программы подсчитайте сколько счастливых билетов в одном рулоне? */

public class Task6 {
    public static void main(String[] args) {
        int sum = 0;
        for(int ticket = 000001; ticket <= 999999; ticket++){
            int p1 = ticket/100000;
            int p2 = (ticket%100000)/10000;
            int p3 = (ticket%10000)/1000;
            int p4 = (ticket%1000)/100;
            int p5 = (ticket%100)/10;
            int p6 = ticket%10;

            if(p1 + p2 + p3 == p4 + p5 + p6){
                sum++;
            }
        }
        System.out.println( sum + " счастливых билетов.");
    }
}
