package addition;

public class AdditionOfTwoShortNos {
    public void add() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform addition
         - print the output
        */

        short no1 = 3217;
        short no2 = 567;
        System.out.println("sum of no.1 & no.2 = " + (no1 + no2));
    }

    public static void main(String[] args) {
        AdditionOfTwoShortNos sum = new AdditionOfTwoShortNos();
        sum.add();
    }
}
