package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assignment: =
        int number =100;

        System.out.println("number = " + number); //100

        number = 200;

   System.out.println("number = " + number );

   String word = "Java Programing";

        System.out.println("word = " + word);

        word = "Wooden Spoon";

        System.out.println("word = " + word);

        word = "Cydeo";

        System.out.println("word = " + word);

        // word = 123;
        word ="Ahmet Cevdet";

        System.out.println("word = " + word);

        System.out.println(" =================");

        //Addition Assignment:
        int x=100;

        System.out.println("x = " + x);

        System.out.println(x + 200 );

        // x = x + 200
        x +=200;
        System.out.println("x = " + x); //
        
        String str = "Wooden";
        
        str += "Spoon";

        System.out.println("str = " + str);


        double num1 = 2.5;

        System.out.println("num1 = " + num1);
        
        num1 += 5.5;

        System.out.println("num1 = " + num1);


        double availableBalance = 1000.50;

        //deposit 300$
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);


        System.out.println("------------------------------");

        availableBalance -=500;

        System.out.println("availableBalance = " + availableBalance);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        double salary = 50000.50;

        System.out.println("salary = " + salary);

        salary *= 2;

        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 100000;

        System.out.println("doge = " + doge);


        System.out.println(" ************************************ " );
        
        
        double num2 = 25000.0;
        
        //num2 = num2 / 2;
         num2 /= 2;

         System.out.println("num2 = " + num2);

         System.out.println("######################");

         
         double num3 = 100;
         
         num3 %= 3;

         System.out.println("num3 = " + num3);

         System.out.println(">>>>>>>>>>>>>>>>>>>");

         int amount = 127;

         int quarters =amount / 25;

         int cent =amount % 25;

         System.out.println("quarters = " + quarters);
         System.out.println("cent = " + cent);

         int cents2 = 127;

         cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("--------------------------");
        
        int y =300;
        
        y %= 16;

        System.out.println("y = " + y);

        int balance = 3500;

        // insurance fee : $153


        balance %= 153;

        System.out.println("balance = " + balance);







    }
}
