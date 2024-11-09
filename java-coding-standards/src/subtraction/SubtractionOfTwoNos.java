package subtraction;

public class SubtractionOfTwoNos {

    public void subtract() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform subtraction
         - print the output
        */

        int no1 = 4667;
        int no2 = 567;
        System.out.println("subtraction of no.1 & no.2 = " + (no1 - no2));
    }

    public static void main(String[] args) {
        SubtractionOfTwoNos result = new SubtractionOfTwoNos();
        result.subtract();
    }
}
