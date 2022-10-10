package lab_3;

import java.util.Scanner;

public class Lab_3_3 {
    public static void main(String[] args) {
        int[] array = createArray();
        sortAsc(array);
        System.out.print("After sorting, the array is: ");
        printArray(array);
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

    private static void sortAsc(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = sortedArray.length - 1; j >= i + 1; j--) {
                if (sortedArray[j] < sortedArray[j - 1]) {
                    int tmp = sortedArray[j - 1];
                    sortedArray[j - 1] = sortedArray[j];
                    sortedArray[j] = tmp;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.printf("%d ", j);
        }
    }
}
