package lab_02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Welcome to BMI Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height(m): ");
        double height = scanner.nextDouble();
        System.out.print("Please input your weight(kg): ");
        double weight = scanner.nextDouble();
        double BMI = weight / (height * 2);
        if (BMI < 18.5) {
            System.out.println("\tYou are Underweight!");
            double needGain = (18.5 * height * 2) - weight;
            System.out.printf("--> You should gain at least %.2fkg weight to be Normal Weight", needGain);
        } else if (BMI < 24.9) {
            System.out.println("\tYou are Normal Weight!");
        } else if (BMI < 29.9) {
            System.out.println("\tYou are Overweight!");
            double needLose = weight - (24.9 * height * 2);
            System.out.printf("--> You should lose at least %.2fkg weight to be Normal Weight", needLose);
        } else {
            System.out.println("\tYou are Obesity!");
            double needLose = weight - (24.9 * height * 2);
            System.out.printf("--> You should lose at least %.2fkg weight to be Normal Weight", needLose);
        }
    }
}
