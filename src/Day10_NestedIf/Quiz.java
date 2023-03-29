package Day10_NestedIf;

public class Quiz {

    public static void main(String[] args) {
        int z = 10;

        switch (z){

            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            case 12:
                System.out.println("Wednesday");
            default:
                System.out.println("Friday");
        }

        float f1 = (1_560.00 > 12_60.00) ? 10 : 20;
        System.out.println(f1);
    }
}
