package subtraction;

public class SubtractionOfTwoBigDecimals {
    public void subtract() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform subtraction
         - print the output
        */

        double no1 = 46.966789000;
        double no2 = 78.9999999999;
        System.out.println("subtraction of no.1 & no.2 = " + (no1 - no2));
    }

    public static void main(String[] args) {
        SubtractionOfTwoBigDecimals result = new SubtractionOfTwoBigDecimals();
        result.subtract();
    }
}
