package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
         String name = "josh";
         int age = 17;
         String citizen = "USA";

         boolean isEligible = age>=21 && citizen =="USA";
         //eligible

        if(isEligible){
            System.out.println("Eligible");
        }

        //not

        if(!isEligible){
            System.out.println("not Eligible");
        }
    }
}
