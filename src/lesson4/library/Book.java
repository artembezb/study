package lesson4.library;

public class Book {
    String title;
    int pages;
    int year;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages='" + pages + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
