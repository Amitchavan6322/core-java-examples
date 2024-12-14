package patterns;

public class TriangleStarPattern {
    public static void main(String[] args) {
        int i;
        for (i = 5; i > 0; i--) {
            for (int k = 0; k < i / 2; k++) {
                //System.out.println(i/2);
                System.out.print("A");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }

            for (int k = 0; k < i / 2; k++) {
                //System.out.println(i/2);
                System.out.print("A");
            }
            System.out.println("");
        }

    }
}
