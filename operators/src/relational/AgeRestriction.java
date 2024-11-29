package relational;

import java.util.Scanner;

public class AgeRestriction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");

        try {
            double age = Double.parseDouble(scanner.nextLine());
            if (age > 18) {
                System.out.println("Congratulations, you have access to this web content");
            } else {
                System.out.println("Alert:: Access denied, you are too young to access this web content");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. please enter a valid age");
        }

    }
}
