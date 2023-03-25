package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 20,
                b = 50,
                c = 10;
        boolean aIsMedian = (a>b && a<c) || (a<b && a>c);

        boolean bIsMedian = (b>a && b<c) || (b<a && b>c);

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian){
            System.out.println(a + "is median number");

        }

        if(bIsMedian){
            System.out.println(b + "is median number");

        }

        if(cIsMedian){
            System.out.println(c + "is median number");

        }


    }

}
