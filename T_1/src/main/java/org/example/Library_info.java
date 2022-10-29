package org.example;


public class Library_info {

    public void takeBook(Reader reader, Book[] books) {
        System.out.println(reader.getName() + " взял " + books.length + " книг(и/у)");
    }
    public void returnBook(Reader reader, Book[] books) {
        System.out.println(reader.getName() + " вернул " + books.length + " книг(и/у)");
    }
}
