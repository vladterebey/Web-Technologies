package Lab1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Book book1 = new Book("Title1", "Tolstoy", 1, 2);
        Book book2 = new Book("Title2", "Pushkin", 4, 6);
        System.out.println("книга 1: " + book1.toString());
        System.out.println("книга 2: " + book2.toString());
        System.out.println("Результат сравнения книг: " + book1.equals(book2));
        System.out.println("Хэш-код книги 1: " + book1.hashCode());
        System.out.println("Хэш-код книги 2: " + book2.hashCode());

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }
}


