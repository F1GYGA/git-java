package com.qa;

import java.util.ArrayList;

public class TestBooks {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "Author 1",100);
        Book book2 = new Book("Book2", "Author 2",900);
        Book book3 = new Book("Book3", "Author 3",1000);

        ArrayList<Book> listOfBooks = new ArrayList<Book>();

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);


        for(Book book:listOfBooks){
            System.out.println(book);
        }
    }
}
