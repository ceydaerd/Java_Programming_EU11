package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double radius = 6.5;
        double PI = 3.14;

        double diameter = radius * 2; // finds the diameter by multiplying the radius to 2
        double area = radius * radius * PI; // finds the area
        double perimeter = diameter * PI; // finds the  perimeter

        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}