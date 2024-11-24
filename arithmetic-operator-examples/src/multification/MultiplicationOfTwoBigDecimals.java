package multification;

public class MultiplicationOfTwoBigDecimals {
    public void multiply() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform multiplication
         - print the output
        */

        double no1 = 46.966789000;
        double no2 = 78.9999999999;
        System.out.println("multiplication of no.1 & no.2 = " + (no1 * no2));
    }

    public static void main(String[] args) {
        MultiplicationOfTwoBigDecimals result = new MultiplicationOfTwoBigDecimals();
        result.multiply();
    }
}
