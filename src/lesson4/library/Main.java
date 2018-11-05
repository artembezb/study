package lesson4.library;

/*
3. Сделать библиотеку, которая ведет учет книг. Должно быть как минимум два класса: Book и Library.
Library имеет два метода: void put(Book book, int quantity) и int get(Book book, int quantity).
Каждой книге в библиотеке соответствует счетчик, показывающий количество хранящихся книг,
при добавлении книги - счетчик увеличивается, при извлечении - уменьшается на число quantity.
Библиотека хранит ограниченное число книг, сколько - на ваше усмотрение.
 */

import lesson4.library.Book;
import lesson4.library.Library;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Философия Java", 638, 2006);
        Book book2 = new Book("Java.Основы программирования", 789, 2013);
        Book book3 = new Book("Java.Практическое пособие", 323, 2002);
        Book book4 = new Book("Основы логопедии", 154, 1996);

        Library library = new Library(200);

        library.put(book1,4);
        library.put(book2,3);
        library.put(book3,5);
        library.put(book4,1);

        System.out.println(library.toString());


        library.getBook(book2,2);

        System.out.println(library.toString());

    }
}
