package lab_3;

import java.util.Scanner;

public class Lab_3_2 {
    private static int min;
    private static int max;

    public static void main(String[] args) {
        int[] array = createArray();
        findMin(array);
        findMax(array);
        System.out.printf("Minimum: %d\n", min);
        System.out.printf("Maximum: %d\n", max);
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

    private static void findMin(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i==0){
                min = array[i];
            } else {
                if (min > array[i]) {
                    min = array[i];
                }
            }
        }
    }

    private static void findMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i==0){
                max = array[i];
            } else {
                if (max < array[i]) {
                    max = array[i];
                }
            }
        }
    }
}
