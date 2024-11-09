package addition;

public class AdditionOfTwoNos {

    public void add() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform addition
         - print the output
        */

        int no1 = 467;
        int no2 = 567;
        System.out.println("sum of no.1 & no.2 = " + (no1 + no2));
    }

    public static void main(String[] args) {
        AdditionOfTwoNos sum = new AdditionOfTwoNos();
        sum.add();
    }
}
