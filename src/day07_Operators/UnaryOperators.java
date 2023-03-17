package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args){

        int num1 = +25;
        int num2 = -25;


        System.out.println( num1 < 0 ); // false
        System.out.println( num2 < 0 ); //true

        System.out.println("-----------------------------");

        int a =5;
        ++a; //pre increment:increases the value by 1 right away

        System.out.println(a);

        --a; //pre decrement :decreases the value by1 right away

        System.out.println(a);

    }
}
