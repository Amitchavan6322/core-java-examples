package patterns;

public class TriangleStarPattern {
    public static void main(String[] args) {
        // psudo code
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *

        int i;

        // loop to iterate for rows
        for (i = 0; i <= 5; i++) {

            // loop to print spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // loop to print *
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
