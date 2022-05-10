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
            System.out.println("Print number if you want:\n" + "1. Add book\n" + "2. Delete\n" + "3. Info\n" +
                    "4. How many books in bookshelf\n" + "5. How many free space in bookshelf\n" +
                    "6. Clear bookshelf\n" + "7. See bookshelf\n" + "8. Exit");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == 8) {
                break;
            } else {
                scanner = new Scanner(System.in);
                switch (answer) {
                    case 1:
                        System.out.println("Enter <author>, <tittle>, <publishYear> for add book: ");
                        String[] addBook = scanner.nextLine().split(", ");
                        Book book = new Book(addBook[0], addBook[1], Integer.parseInt(addBook[2]));
                        bookshelf.add(book);
                        break;
                    case 2:
                        System.out.println("Enter <tittle> fot delete: ");
                        bookshelf.delete(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter <tittle> fot info: ");
                        System.out.println(bookshelf.getInfo(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.print("Books in bookshelf: " + bookshelf.countBooks() + "\n");
                        break;
                    case 5:
                        System.out.print("Free place in bookshelf: " + bookshelf.freePlace() + "\n");
                        break;
                    case 6:
                        bookshelf.clear();
                        System.out.println("Bookshelf is clean");
                        break;
                    case 7:
                        bookshelf.getAll();
                        break;
                    default:
                        System.out.println("You enter wrong number");
                }
            }
        }
    }
}