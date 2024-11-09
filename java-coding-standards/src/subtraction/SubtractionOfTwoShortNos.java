package subtraction;

public class SubtractionOfTwoShortNos {
    public void subtract() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform subtraction
         - print the output
        */

        short no1 = 3217;
        short no2 = 567;
        System.out.println("subtraction of no.1 & no.2 = " + (no1 - no2));
    }

    public static void main(String[] args) {
        SubtractionOfTwoShortNos result = new SubtractionOfTwoShortNos();
        result.subtract();
    }
}
