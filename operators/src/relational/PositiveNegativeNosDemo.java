package relational;

import java.util.Scanner;

public class PositiveNegativeNosDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any integer number");
        int no = Integer.parseInt(scanner.nextLine());

        if(no > 0){
            System.out.println("number is positive");
        }
        else if(no == 0){
            System.out.println("number is exactly 0");
        }

        else {
            System.out.println("number is negative");
        }

    }
}
