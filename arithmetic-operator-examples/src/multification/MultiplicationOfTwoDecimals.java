package multification;

public class MultiplicationOfTwoDecimals {
    public void multiply() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform multiplication
         - print the output
        */

        float no1 = 46.9f;
        float no2 = 56f;
        System.out.println("multiplication of no.1 & no.2 = " + (no1 * no2));
    }

    public static void main(String[] args) {
        MultiplicationOfTwoDecimals result = new MultiplicationOfTwoDecimals();
        result.multiply();
    }
}
