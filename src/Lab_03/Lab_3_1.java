package Lab_03;

import java.util.Scanner;

public class Lab_3_1 {
    public static void main(String[] args) {
        int quantity;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please input quantity of array (0 < Quantity < 10): ");
            quantity = scanner.nextInt();
        } while (quantity >= 10 || quantity < 0);
        System.out.printf("Please input a array with %d number\n", quantity);
        int[] array = new int[quantity];
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < (quantity); i++) {
            System.out.printf("Number %d: ", i + 1);
            array[i] = scanner.nextInt();
            if (oddEvenNumber(array[i])) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.printf("Even numbers: %d\n", countEven);
        System.out.printf("Odd numbers: %d\n", countOdd);
    }

    private static boolean oddEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
