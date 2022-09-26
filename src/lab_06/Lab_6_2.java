package lab_06;

import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int count = 0;
        while (count < 3) {
            System.out.print("Input Password: ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();
            if (userInput.equals(myPassword)) {
                System.out.println("Password is correct");
                break;
            } else {
                System.out.println("Wrong password!!");
                count++;
            }
        }
        if (count >= 3) {
            System.out.println("You are blocked");
        }
    }
}
