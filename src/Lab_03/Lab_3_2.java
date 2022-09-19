package Lab_03;

import java.util.Scanner;

public class Lab_3_2 {
    private static int min;
    private static int max;

    public static void main(String[] args) {
        int quantity;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please input quantity of array (0 < Quantity < 10): ");
            quantity = scanner.nextInt();
        } while (quantity >= 10 || quantity < 0);
        System.out.printf("Please input a array with %d numbers\n", quantity);
        int[] array = new int[quantity];
        for (int i = 0; i < (quantity); i++) {
            System.out.printf("Number %d: ", i + 1);
            array[i] = scanner.nextInt();
            if (i == 0) {
                min = array[i];
                max = array[i];
            }
            findMin(array[i]);
            findMax(array[i]);
        }
        System.out.printf("Minimum: %d\n", min);
        System.out.printf("Maximum: %d\n", max);
    }

    private static void findMin(int number) {
        if (min > number) {
            min = number;
        }
    }

    private static void findMax(int number) {
        if (max < number) {
            max = number;
        }
    }
}
