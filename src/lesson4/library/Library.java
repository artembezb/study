package lesson4.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import lesson4.library.Book;

public class Library {
    int count;
    Book[] library;
    int size;

    public void put(Book book, int quantity) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null) {
                continue;
            } else if(library[i]==null && quantity >0) {
                library[i] = book;
                count++;
                quantity--;
                continue;
            }
        }
        System.out.println("Количество книг в библиотеке " + count);
    }


    public int getBook(Book book, int quantity) {

        for (int i = 0; i < library.length; i++) {
            if (library[i] == book && quantity > 0) {
                count--;
                library[i] = null;
                quantity--;
            } else if (i == library.length && quantity == quantity) {
                System.out.println("В данный момент такая книга отсутсвует в библиотеке");
            } else if (i == library.length && quantity < quantity) {
                System.out.println("Больше не соталось экземплряров данной книги");
            }
        }
        System.out.println("В бибилотеке осталось " + count + "книг");
        return count;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + Arrays.toString(library) +
                '}';
    }

    public Library(int size) {
        this.size = size;
        Book[] library = new Book[size];
        this.library = library;
    }

    public void setLibrary(Book[] library) {
        this.library = library;
    }
}
