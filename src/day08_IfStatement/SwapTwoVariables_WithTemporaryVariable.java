package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        int a =10;
        int b =15;
//---------------------------------------------
        // istenilen = degiskenlerin degerini takas etmek
        // a'nin degerini c degiskenine atarsam
        // artik a degiskenine b degerini atayabilirim
        //artik tek yapmam gereken daha once c degiskenine atadagim a degisken degerini direk b'ye atayabilirim
        int c = b;

        b = a;
        a = c;


 //---------------------------------------------
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
