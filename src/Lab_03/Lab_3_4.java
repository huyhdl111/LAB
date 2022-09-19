package Lab_03;

import java.util.Scanner;

public class Lab_3_4 {
    public static void main(String[] args) {
        int firstQuantity;
        int secondQuantity;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please input quantity of 1st array (0 < Quantity < 10): ");
            firstQuantity = scanner.nextInt();
        } while (firstQuantity >= 10 || firstQuantity < 0);
        System.out.printf("Please input a 1s array with %d numbers\n", firstQuantity);
        int[] array1st = new int[firstQuantity];
        for (int i = 0; i < (firstQuantity); i++) {
            System.out.printf("Number %d: ", i + 1);
            array1st[i] = scanner.nextInt();
        }
        do {
            System.out.print("Please input quantity of 2nd array (0 < Quantity < 10): ");
            secondQuantity = scanner.nextInt();
        } while (secondQuantity >= 10 || secondQuantity < 0);
        System.out.printf("Please input a 1s array with %d numbers\n", secondQuantity);
        int[] array2nd = new int[secondQuantity];
        for (int i = 0; i < (secondQuantity); i++) {
            System.out.printf("Number %d: ", i + 1);
            array2nd[i] = scanner.nextInt();
        }
        int[] sortedArray = new int[firstQuantity + secondQuantity];
        for (int i = 0; i < (firstQuantity + secondQuantity); i++) {
            if (i < firstQuantity) {
                sortedArray[i] = array1st[i];
            } else {
                sortedArray[i] = array2nd[i-firstQuantity];
            }
        }
        sortAsc(sortedArray);
        System.out.print("After sorting, the array is: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.printf("%d ", sortedArray[i]);
        }
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
}
