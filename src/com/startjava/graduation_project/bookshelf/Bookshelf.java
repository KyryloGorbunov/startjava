package com.startjava.graduation_project.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    private int count;
    private Book[] books = new Book[10];

    public void countBooks() {
        System.out.println(count);
    }

    public void freePlace() {
        System.out.println(books.length - count);
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

    public void getInfo(String name) {
        for (int i = 0; i < count; i++) {
            if (name.equals(books[i].getName())) {
                System.out.println(books[i]);
                break;
            }
        }
    }

    public void delete(String name) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (name.equals(books[i].getName())) {
                index = i;
                break;
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

    public void print(int answer) {
        Scanner scanner = new Scanner(System.in);
        switch (answer) {
            case 1:
                System.out.println("Enter <author>, <tittle>, <publishYear> for add book: ");
                String[] addBook = scanner.nextLine().split(", ");
                Book book = new Book(addBook[0], addBook[1], Integer.parseInt(addBook[2]));
                add(book);
                break;
            case 2:
                System.out.println("Enter <tittle> fot delete: ");
                delete(scanner.nextLine());
                break;
            case 3:
                System.out.println("Enter <tittle> fot info: ");
                getInfo(scanner.nextLine());
                break;
            case 4:
                System.out.print("Books in bookshelf: ");
                countBooks();
                break;
            case 5:
                System.out.print("Free place in bookshelf: ");
                freePlace();
                break;
            case 6:
                System.out.println("Bookshelf is clean");
                clear();
                break;
            case 7:
                getAll();
                break;
            default:
                System.out.println("You enter wrong number");
        }
    }
}