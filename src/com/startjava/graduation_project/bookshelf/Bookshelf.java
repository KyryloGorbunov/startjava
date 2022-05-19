package com.startjava.graduation_project.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int count;
    private final Book[] books = new Book[10];

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

    public void add(String bookInfo) {
        String[] bookData = bookInfo.split(", ");
        Book book = new Book(bookData);
        if (count < books.length) {
            books[count] = book;
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
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (name.equals(books[i].getName())) {
                index = i;
            }
        }
        if (index >= 0) {
            System.arraycopy(books, index + 1, books, index, count);
            count--;
        }
    }

    public void clear() {
        Arrays.fill(books, 0, count, null);
        count = 0;
    }
}