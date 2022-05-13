package com.startjava.graduation_project.bookshelf;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String[] bookInfo) {
        this.author = bookInfo[0];
        this.name = bookInfo[1];
        this.year =Integer.parseInt(bookInfo[2]);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  author + ", "
                + name + ", "
                + year;
    }
}
