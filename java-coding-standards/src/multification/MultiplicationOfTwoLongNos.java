package multification;

public class MultiplicationOfTwoLongNos {
    public void multiply() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform multiplication
         - print the output
        */

        long no1 = 3217567L;
        long no2 = 567780L;
        System.out.println("multiplication of no.1 & no.2 = " + (no1 * no2));
    }

    public static void main(String[] args) {
        MultiplicationOfTwoLongNos result = new MultiplicationOfTwoLongNos();
        result.multiply();
    }
}

