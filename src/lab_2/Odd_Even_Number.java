package lab_2;

import java.util.Scanner;

public class Odd_Even_Number {
    public static void main(String[] args) {
        System.out.print("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if ((number % 2) == 0) {
            System.out.print("This is even number");
        } else {
            System.out.print("This is odd number");
        }
    }
}
