package relational;

import java.util.Scanner;

public class StockMonitoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stock ongoing price");

        try {
            double stockPrice = Double.parseDouble(scanner.nextLine());
            if (100 < stockPrice) {
                System.out.println("Alert: stock price has fallen below 100 rupees");
            } else {
                System.out.println("wait: stock price is still above 100 rupees");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. please enter a valid age");
        }
    }
}
