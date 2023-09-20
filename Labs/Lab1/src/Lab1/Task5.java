package Lab1;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество элементов массива: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов массива: ");

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        int result = f(array);
        System.out.println("Минимальное число вычеркнутых: " + result);

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }

    public static int f(int[] array) {
        int N = array.length;
        int maxCount = 0;
        int[] count = new int[N];
        count[0] = 1;

        for (int i = 1; i < N; i++) {
            int localMax = -1;
            int maxInd = 0;

            for (int j = 0; j < i; j++) {
                if ((array[i] > array[j]) && (array[j] > localMax)) {
                    maxInd = j;
                    localMax = array[j];
                }
            }

            if (localMax != -1)
                count[i] = count[maxInd] + 1;
            else
                count[i] = 1;

            if (count[i] > maxCount)
                maxCount = count[i];
        }

        return N - maxCount;
    }
}
