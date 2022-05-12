package com.startjava.graduation_project.bookshelf;

import java.util.Scanner;

public class BookshelfMain {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.add("Scott Chacon and Ben Straub, Pro Git, 2014");
        bookshelf.add("Matt Weisfeld, Object-Oriented Thought Process, 2013");
        bookshelf.add("Bert Bates and Kathy Sierra, Head First Java, 2005");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            bookshelf.getAll();
            System.out.println("Print number if you want:\n" +
                    "1. Add book\n" +
                    "2. Delete\n" +
                    "3. Info\n" +
                    "4. How many books in bookshelf\n" +
                    "5. How many free space in bookshelf\n" +
                    "6. Clear bookshelf\n" +
                    "7. See bookshelf\n" +
                    "8. Exit");
            int answer = scanner.nextInt();
            if (answer == 8) {
                break;
            } else {
                switch (answer) {
                    case 1:
                        System.out.println("Enter <author>, <tittle>, <publishYear> for add book: ");
                        scanner.nextLine();
                        bookshelf.add(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter <tittle> fot delete: ");
                        scanner.nextLine();
                        bookshelf.delete(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter <tittle> fot info: ");
                        scanner.nextLine();
                        System.out.println(bookshelf.getInfo(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.print("Books in bookshelf: " + bookshelf.getNumBooks() + "\n");
                        break;
                    case 5:
                        System.out.print("Free place in bookshelf: " + bookshelf.getFreePlace() + "\n");
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