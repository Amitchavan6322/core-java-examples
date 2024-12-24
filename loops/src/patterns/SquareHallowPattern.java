package patterns;

public class SquareHallowPattern {
    public static void main(String[] args) {
        // psudo code

        // * * * * *
        // *       *
        // *       *
        // *       *
        // * * * * *

        int i, j;
        int n = 5, m = 5;


        for (i = 1; i <= n; i++) {

            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}

