package division;

public class DivisionOfTwoNos {

    public void divide() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform division
         - print the output
        */

        int no1 = 4667;
        int no2 = 567;
        System.out.println("division of no.1 & no.2 = " + (no1 / no2));
    }

    public static void main(String[] args) {
        DivisionOfTwoNos result = new DivisionOfTwoNos();
        result.divide();
    }
}
