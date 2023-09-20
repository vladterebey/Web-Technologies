package Lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x: ");
        double x = in.nextDouble();
        System.out.print("y: ");
        double y = in.nextDouble();

        System.out.println("Результат: " + f(x, y));

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }

    public static double f(double x, double y)
    {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + Math.pow(x*y,2)))) + x;
    }
}

