package Day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*

       90-100 : excellent
       80-89 : great
       70-79 : good
       60-69 : passed
       0=59 : failed

         */

        int score = 95;
        if( score >= 0 && score <= 100 ){
            //5 possibilities
            if(score>=90 && score <=100){
                System.out.println("excellent");
            }else if(score>=80 && score<=89){
                System.out.println("great");
            }else if(score>=70 && score<=79){
                System.out.println("good");
            }else if(score >= 60 && score<=69){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }
        }else {//if the score is NOT valid
            System.out.println(" Invalid Score");
        }

        System.out.println("==========================");



                String result = "";
                if( score >= 0 && score <= 100 ){
                    //5 possibilities
                    if(score>=90 && score <=100){
                        result ="excellent";
                    }else if(score>=80 && score<=89){
                        result ="great";
                    }else if(score>=70 && score<=79){
                        result ="good";
                    }else if(score >= 60 && score<=69){
                        result = "passed";
                    }else{
                        result="failed";
                    }
                }else {//if the score is NOT valid
                    result =" Invalid Score";
                }


                System.out.println("result = " + result);

                System.out.println("==========================");






        }


    }

