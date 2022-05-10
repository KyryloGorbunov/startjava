package com.startjava.graduation_project.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int count;
    private Book[] books = new Book[10];

    public int countBooks() {
        return count;
    }

    public int freePlace() {
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

    public void add(Book b) {
        if (count < books.length) {
            books[count] = b;
            count++;
        } else {
            System.out.println("Bookshelf is full");
        }
    }

    public Book getInfo(String name) {
        Book book = null;
        for (int i = 0; i < count; i++) {
            if (name.equals(books[i].getName())) {
                book = books[i];
                break;
            } else {

            }
        }
        return book;
    }

    public void delete(String name) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (name.equals(books[i].getName())) {
                index = i;
            }
        }
        if (index >= 0) {
            for (int j = index; j < count - 1; j++) {
                books[j] = books[j + 1];
            }
            count--;
        }
    }

    public void clear() {
        Arrays.fill(books, 0, count, null);
        count = 0;
    }

}