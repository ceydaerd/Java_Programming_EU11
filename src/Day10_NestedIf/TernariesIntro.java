package Day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 99;

        if (n % 2 == 0 ){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        String orhun = (n % 2 == 0 ) ? "Even": "Odd";
        System.out.println(orhun);

        int age = 23;

        String isim =( age >= 21 ) ? " Eligible" : "Not Eligible";
        System.out.println(isim);


        System.out.println("-------------------------");



        int number = 100;

        /*
        if(number >0){
            System.out.println("positive");
        }else if(number<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
*/

        String result3 = (number>0)?  "positive" :(number<0)? "negative" : "zero";
        System.out.println( result3);
    }
}
