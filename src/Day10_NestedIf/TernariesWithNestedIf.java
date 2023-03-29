package Day10_NestedIf;

import java.sql.SQLOutput;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int s = 3;

        /*

        if(s>= 0 && s <=100){

            if(s>=60){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }

        }else{
            System.out.println("invalid score");
        }

         */

        String result = (s>=0 && s<=100)? (s>=60)? "passed" : "failed" :"invalid score";

        System.out.println(result);
    }
}
