package Lab_03;

import java.util.Scanner;

public class Lab_3_4 {
    public static void main(String[] args) {
        int[] array1st = createArray(1);
        int[] array2nd = createArray(2);
        int[] mergedArray = mergeTwoArray(array1st, array2nd);
        sortAsc(mergedArray);
        System.out.print("After sorting, the array is: ");
        printArray(mergedArray);
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

    private static int[] createArray(int arrayQuantity) {
        int quantity;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Please input quantity of array_%d (0 < Quantity < 10): ", arrayQuantity);
            quantity = scanner.nextInt();
        } while (quantity >= 10 || quantity < 0);
        System.out.printf("Please input array_%d with %d numbers\n", arrayQuantity, quantity);
        int[] array = new int[quantity];
        for (int i = 0; i < (array.length); i++) {
            System.out.printf("Number %d: ", i + 1);
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int[] mergeTwoArray(int[] array1st, int[] array2nd) {
        int[] mergedArray = new int[array1st.length + array2nd.length];
        for (int i = 0; i < ((array1st.length + array2nd.length)); i++) {
            if (i < array1st.length) {
                mergedArray[i] = array1st[i];
            } else {
                mergedArray[i] = array2nd[i - array1st.length];
            }
        }
        return mergedArray;
    }

    private static void printArray(int[] array){
        for (int j : array) {
            System.out.printf("%d ", j);
        }
    }

}

