package Lab_03;

import java.util.Scanner;

public class Lab_3_1 {
    private static int countEven;
    private static int countOdd;

    public static void main(String[] args) {
        int[] array = createArray();
        countOddEvenNumber(array);
        System.out.printf("Even numbers: %d\n", countEven);
        System.out.printf("Odd numbers: %d\n", countOdd);
    }

    private static int[] createArray() {
        int quantity;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Please input quantity of array (0 < Quantity < 10): ");
            quantity = scanner.nextInt();
        } while (quantity >= 10 || quantity < 0);
        System.out.printf("Please input array with %d numbers\n", quantity);
        int[] array = new int[quantity];
        for (int i = 0; i < (array.length); i++) {
            System.out.printf("Number %d: ", i + 1);
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void countOddEvenNumber(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < (array.length); i++) {
            if ((array[i]) % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
    }
}
