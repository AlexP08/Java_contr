package org.example;

import java.awt.print.Book;
import java.util.ArrayList;

public class Reader {
    private String sur_name;
    private String name;
    private int birth_day;
    private String faculty;
    private String phone_number;
    private int library_card;
    private ArrayList<Book[]> taken_books;

    public Reader(String sur_name, String name, int birth_day, String faculty, String phone_number, int library_card) {
        this.sur_name = sur_name;
        this.name = name;
        this.birth_day = birth_day;
        this.faculty = faculty;
        this.phone_number = phone_number;
        this.library_card = library_card;
        taken_books = new ArrayList<Book[]>();
    }

    public String getSur_name() {
        return sur_name;
    }

    public String getName() {
        return name+" "+sur_name;
    }

    public void takeBook(Book[] book) {
        taken_books.add(book);
    }

    public void returnBook(Book[] book) {
        if(taken_books.contains(book)) {
            taken_books.remove(book);
        }
    }
}
