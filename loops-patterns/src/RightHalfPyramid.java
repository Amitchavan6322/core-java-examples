public class RightHalfPyramid {

    // pseudo code
    // print following pattern
    // *
    // **
    // ***
    // ****
    // *****

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}
