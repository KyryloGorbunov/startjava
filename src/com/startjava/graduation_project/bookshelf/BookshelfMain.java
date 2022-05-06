package com.startjava.graduation_project.bookshelf;

import java.util.Scanner;

public class BookshelfMain {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.add(new Book("Scott Chacon and Ben Straub", "Pro Git", 2014));
        bookshelf.add(new Book("Matt Weisfeld", "Object-Oriented Thought Process", 2013));
        bookshelf.add(new Book("Bert Bates and Kathy Sierra", "Head First Java", 2005));
        bookshelf.getAll();
        while (true) {
            System.out.println("Print number if you want:\n" + "1. Add book\n" +
                    "2. Delete\n" + "3. Info\n" + "4. How many books in bookshelf\n" +
                    "5. How many free space in bookshelf\n" + "6. Clear bookshelf\n" + "7. See bookshelf\n" + "8. Exit");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == 8) {
                break;
            } else {
                bookshelf.print(answer);
            }
        }
    }
}