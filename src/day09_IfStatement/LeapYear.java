package day09_IfStatement;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2007;

        boolean leapYear = year % 4 == 0;
        if(leapYear){
            System.out.println(" Year " + year +" is a leap year");
        }

        if(!leapYear){
            System.out.println("year " + year + " is not leap year.");
        }

        if(leapYear){
            System.out.println("Year " + year + "is a leap year");
        } else{
            System.out.println("year" + year+ " is NOT a leap year");
        }
    }
}
