package patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        // psudo code
        //     *
        //    * *
        //   * * *
        //  * * * *
        //   * * *
        //    * *
        //     *


        int i;

        // loop to iterate 1st half diamond
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

        // loop to iterate 2nd half diamond
        for (i = 4; i >= 0; i--) {

            // loop to print spaces
            for (int j = 4; j >= i; j--) {
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
