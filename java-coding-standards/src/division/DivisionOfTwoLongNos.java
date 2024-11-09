package division;

public class DivisionOfTwoLongNos {
    public void divide() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform division
         - print the output
        */

        long no1 = 3217567L;
        long no2 = 567780L;
        System.out.println("division of no.1 & no.2 = " + (no1 / no2));
    }

    public static void main(String[] args) {
        DivisionOfTwoLongNos result = new DivisionOfTwoLongNos();
        result.divide();
    }
}

