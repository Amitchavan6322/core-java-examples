package multification;

public class MultiplicationOfTwoNos {

    public void multiply() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform multiplication
         - print the output
        */

        int no1 = 4667;
        int no2 = 567;
        System.out.println("multiplication of no.1 & no.2 = " + (no1 * no2));
    }

    public static void main(String[] args) {
        MultiplicationOfTwoNos result = new MultiplicationOfTwoNos();
        result.multiply();
    }
}
