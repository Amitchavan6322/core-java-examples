package division;

public class DivisionOfTwoDecimals {
    public void divide() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform division
         - print the output
        */

        float no1 = 46.9f;
        float no2 = 56f;
        System.out.println("division of no.1 & no.2 = " + (no1 / no2));
    }

    public static void main(String[] args) {
        DivisionOfTwoDecimals result = new DivisionOfTwoDecimals();
        result.divide();
    }
}
