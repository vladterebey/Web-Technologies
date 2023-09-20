package Lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество элементов массива: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов массива: ");

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (isPrime(array[i])) System.out.print(i + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }

    static boolean isPrime(int number)
    {
        if (number <= 1) return false;
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) return false;
        }
        return true;
    }
}
