package division;

public class DivisionOfTwoShortNos {
    public void divide() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform division
         - print the output
        */

        short no1 = 3217;
        short no2 = 567;
        System.out.println("division of no.1 & no.2 = " + (no1 / no2));
    }

    public static void main(String[] args) {
        DivisionOfTwoShortNos result = new DivisionOfTwoShortNos();
        result.divide();
    }
}
