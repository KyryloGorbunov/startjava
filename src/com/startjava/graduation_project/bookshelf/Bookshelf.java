package com.startjava.graduation_project.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int count;
    private Book[] books = new Book[10];

    public int getNumBooks() {
        return count;
    }

    public int getFreePlace() {
        return books.length - count;
    }

    public void getAll() {
        for (int i = 0; i < books.length; i++) {
            if (i < count) {
                System.out.format("« %-40s »\n", books[i]);
            } else {
                System.out.format("« %-40s »\n", " ");
            }
        }
    }

    public void add(String book) {
        String[] addBook = book.split(", ");
        Book book1 = new Book(addBook[0], addBook[1], Integer.parseInt(addBook[2]));
        if (count < books.length) {
            books[count] = book1;
            count++;
        } else {
            System.out.println("Bookshelf is full");
        }
    }

    public Book getInfo(String name) {
        for (int i = 0; i < count; i++) {
            if (name.equals(books[i].getName())) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String name) {
        Book[] copyOfBooks = new Book[books.length];
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (name.equals(books[i].getName())) {
                index = i;
            }
        }
        System.arraycopy(books, 0, copyOfBooks, 0, index);
        System.arraycopy(books, index + 1, copyOfBooks, index, books.length - (index + 1));
        books = copyOfBooks;
        count--;
    }

    public void clear() {
        Arrays.fill(books, 0, count, null);
        count = 0;
    }
}