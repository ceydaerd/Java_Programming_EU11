package day09_IfStatement;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 100;

        if (n > 0) {

            System.out.println("POSITIVE");
        }
        if (n < 0) {
            System.out.println("NEGATIVE");
        }

        if (n == 0) {
            System.out.println("ZERO");
        }


        System.out.println("--------------------------");

        boolean pozitive = n > 0;
        boolean negative = n < 0;
        if (n > 0) {
            System.out.println("pozitive");
        } else if (n < 0) {
            System.out.println("negative");

        }else {
            System.out.println("zero");

        }

    }
}
