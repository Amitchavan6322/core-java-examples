public class ReverseRightHalfPyramid {

    // pseudo code
    // print following pattern
    // *****
    // ****
    // ***
    // **
    // *

    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}
