package multification;

public class MultiplicationOfTwoShortNos {
    public void multiply() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform multiplication
         - print the output
        */

        short no1 = 3217;
        short no2 = 567;
        System.out.println("multiplication of no.1 & no.2 = " + (no1 * no2));
    }

    public static void main(String[] args) {
        MultiplicationOfTwoShortNos result = new MultiplicationOfTwoShortNos();
        result.multiply();
    }
}
