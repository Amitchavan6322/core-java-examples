package relational;

import java.util.Scanner;

public class SpeedViolation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your vehicle speed");
        double speed = Double.parseDouble(scanner.nextLine());

        if(speed < 80){
            System.out.println("Congratulations, you are following speed limit");
        }
        else{
            System.out.println("You have been fined for violating speed limit while driving");
        }

    }
}
