package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book("Title1", "Ivanov", 1, 3);
        Book book2 = new Book("Title2", "Petrov", 2, 2);
        Book book3 = new Book("Title3", "Sidorov", 2, 4);
        Book book4 = new Book("Title4", "Zayac", 3, 1);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        System.out.println("По названию: ");
        books.sort(Book::compareTitle);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString() + " ");
        }

        System.out.println("По названию, автору: ");
        books.sort(Book::compareTitleAuthor);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString() + " ");
        }

        System.out.println("По автору, названию: ");
        books.sort(Book::compareAuthorTitle);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString() + " ");
        }

        System.out.println("По автору, названию, цене: ");
        books.sort(Book::compareAuthorTitlePrice);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString() + " ");
        }

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }
}
