import java.util.*;

public class diagonal {

    public static Scanner scn = new Scanner(System.in);

    public static void backslash(int n) {
        int nst = 1;
        int nsp = n - n;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.println("*\t");
            }
            nsp++;
        }

        System.out.println("\t");
    }

    public static void main(String[] args) {
        backslash(scn.nextInt());
    }
}
