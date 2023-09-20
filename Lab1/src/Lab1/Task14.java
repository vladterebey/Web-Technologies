package Lab1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Book book = new Book("Voina_i_mir", "Tolstoy", 1, 2);
        Book clone = book.clone();
        System.out.println("Книга: " + book.toString());
        System.out.println("Копия книги: " + clone.toString());

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }
}
