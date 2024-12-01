package relational;

import java.util.Scanner;

public class SpeedViolation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your vehicle speed");

        try {
            double speed = Double.parseDouble(scanner.nextLine());
            if (80 < speed) {
                System.out.println("Congratulations, you are following speed limit");
            } else {
                System.out.println("You have been fined for violating speed limit while driving");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. please enter a valid age");
        }
    }
}
