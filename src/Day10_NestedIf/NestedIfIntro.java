package Day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {


        int score = 400;

        if (score >= 0 && score <= 100) { // if score is vallid


            if (score >= 60) { //if student passed the exam
                System.out.println("passed");
            } else { // if the student failed the exam
                System.out.println("failed");
            }
        } else { //if the score is not valid
            System.out.println("invalid score");
        }


        System.out.println("-----------------------");

        int age = 19;
        boolean hasId = false;

        if (hasId) {

            if (age >= 21) {
                System.out.println(" Eligible to buy alcohol");
            } else {
                System.out.println("not eligible to buy alcohol");
            }
        }else{
            System.out.println("You must have an ID to buy alcohol");

        }


        System.out.println("---------------------------");


        int number = 1;

        if(number >= 1 && number <= 7 ) {
            if( number == 1){
                System.out.println("Monday");
            }else if( number == 2 ){
                System.out.println("tuesday");
            }else if(number == 3){
                System.out.println("wednesday");
            }else if (number == 4){
                System.out.println("thursday");
            }else if (number == 5){
                System.out.println("friday");
            }else if (number == 6){
                System.out.println("saturday");
            }else {
                System.out.println("sunday");
            }
        } else{
            System.out.println("invalid number");
        }
    }



}
