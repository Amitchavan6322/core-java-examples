package addition;

public class AdditionOfTwoDecimals {
    public void add() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform addition
         - print the output
        */

        float no1 = 46.9f;
        float no2 = 56f;
        System.out.println("sum of no.1 & no.2 = " + (no1 + no2));
    }

    public static void main(String[] args) {
        AdditionOfTwoDecimals sum = new AdditionOfTwoDecimals();
        sum.add();
    }
}
