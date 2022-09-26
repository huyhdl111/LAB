package lab_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_05 {
    public static void main(String[] args) {
        int selection = 0;
        List<Integer> myArray = new ArrayList<>();
        while (selection != 6) {
            createMenu();
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    addNumberToArray(myArray);
                    break;
                case 2:
                    printArray(myArray);
                    break;
                case 3:
                    findMax(myArray);
                    break;
                case 4:
                    findMin(myArray);
                    break;
                case 5:
                    search(myArray);
                    break;
                case 6:
                    System.out.println("===> Goodbye!!");
                    break;
            }
        }
    }

    private static void createMenu() {
        System.out.println("======MENU======");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("6. Exit");
        System.out.print("===> Please select an option: ");
    }

    private static List addNumberToArray(List<Integer> array) {
        System.out.print("====> Please input number: ");
        Scanner scanner = new Scanner(System.in);
        array.add(scanner.nextInt());
        return array;
    }

    private static void printArray(List<Integer> array) {
        System.out.print("Your array: ");
        System.out.println(array.toString());
    }

    private static void findMin(List<Integer> array) {
        int min = 0;
        for (int i = 0; i < array.size(); i++) {
            if (i == 0) {
                min = array.get(i);
            } else {
                if (min > array.get(i)) {
                    min = array.get(i);
                }
            }
        }
        System.out.printf("Minimum of array: %d\n", min);
    }

    private static void findMax(List<Integer> array) {
        int max = 0;
        for (int i = 0; i < array.size(); i++) {
            if (i == 0) {
                max = array.get(i);
            } else {
                if (max < array.get(i)) {
                    max = array.get(i);
                }
            }
        }
        System.out.printf("Maximum of array: %d\n", max);
    }

    private static void search(List<Integer> array){
        System.out.print("Input value you want to search: ");
        Scanner scanner = new Scanner(System.in);
        int keyword = scanner.nextInt();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == keyword){
                System.out.printf("Value is position at %d\n", i);
                break;
            }
        }
        // System.out.printf("Value is position at %d\n", array.indexOf(keyword));
    }

}