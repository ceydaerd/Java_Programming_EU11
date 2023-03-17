package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args){

        byte a = 100;
        short b = a;

        //short b = (short)a;
        //

        int c = (int)b;  // implicit casting
        //int c = (int)b;

        long d = c ;
        //    (long)c


        float e = d;
        double f = e;


        System.out.println("------------------------------");

        int x = 55;
        short y =(short)x;

        System.out.println(x +" : " + y);

        long j = 1_000_000;
        short k = (short)j;

        System.out.println("j=" + j + " k =" + k);

        double l = 2.5;
        float n = (float)l;

        System.out.println(n );


        double o = 10.8;
        int s = (int) o;

        System.out.println(s);

        System.out.println("----------------------------");

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + ":" + s1 );

        float f1 =30.5f;
        long l1 = (long) f1;










    }
}
