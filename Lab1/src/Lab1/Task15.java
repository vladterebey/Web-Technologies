package Lab1;


import java.util.ArrayList;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book(); book1.isbn = 10;
        Book book2 = new Book(); book2.isbn = 11;
        Book book3 = new Book(); book3.isbn = 12;
        Book book4 = new Book(); book4.isbn = 9;
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.sort(Book::compareTo);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString() + " " + books.get(i).isbn);
        }

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }
}
