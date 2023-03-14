package day05_Concatenation;

public class FullName {
    public static void main(String[] args){

        String firstName = "Fatma";
        String middleName = "Ceyda";
        String lastName = "Erdogdu";
        // Fatma Ceyda Erdogdu
        int age = 35;
        String jobTitle = "Nurse";
        String companyName = "Yorturk";
        double salary = 100000.58;

        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println(fullName);

        System.out.println("fullName = " + fullName);

        System.out.println(fullName + " is " + age + " years old.");

        System.out.println(fullName + " is a " + jobTitle + " works at " + companyName + ", and " + fullName + "'s salary is $" + salary);


    }
}
