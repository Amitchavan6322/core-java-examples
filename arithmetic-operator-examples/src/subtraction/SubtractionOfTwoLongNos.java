package subtraction;

public class SubtractionOfTwoLongNos {
    public void subtract() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform subtraction
         - print the output
        */

        long no1 = 3217567L;
        long no2 = 567780L;
        System.out.println("subtraction of no.1 & no.2 = " + (no1 - no2));
    }

    public static void main(String[] args) {
        SubtractionOfTwoLongNos result = new SubtractionOfTwoLongNos();
        result.subtract();
    }
}

