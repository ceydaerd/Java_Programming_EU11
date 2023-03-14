package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args){

        String name = "James King",
                buildingNumber = "11500",
                streetName = "Jones Brench Dr",
                city = "Dublin",
                state = "VA",
                zipCode = "12345";

        /*
        System.out.println(name + "\n" + buildingNumber + " " +
                streetName + "\n" + city + ", " + state + " " + zipCode);
                */
        String shippingAddress = name + "\n" + buildingNumber + " " +
                streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(shippingAddress);
    }
}
