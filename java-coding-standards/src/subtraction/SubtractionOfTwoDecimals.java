package subtraction;

public class SubtractionOfTwoDecimals {
    public void subtract() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform subtraction
         - print the output
        */

        float no1 = 46.9f;
        float no2 = 56f;
        System.out.println("subtraction of no.1 & no.2 = " + (no1 - no2));
    }

    public static void main(String[] args) {
        SubtractionOfTwoDecimals result = new SubtractionOfTwoDecimals();
        result.subtract();
    }
}
