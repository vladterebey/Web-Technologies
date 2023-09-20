package Lab1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        double a = in.nextDouble();
        System.out.print("b: ");
        double b = in.nextDouble();
        System.out.print("h: ");
        double h = in.nextDouble();

        for (double i = a; i <= b; i += h) {
            System.out.println(i + " " + f(i));
        }

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }

    public static double f(double x)
    {
        return Math.tan(x);
    }
}
