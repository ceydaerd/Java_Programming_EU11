package Day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int n = 5;

       String name = (n==1)?"ocak" : (n==2)?"subat" :(n==3)?"mart":(n==4)?"nisan":(n==5)?"mayis":(n==6)?"haziran":(n==7)?"temmuz":(n==8)?"agustos":
        (n==9)?"eylul":(n==10)?"ekim":(n==11)?"kasim":"aralik";


        System.out.println(name);

        /* ternaries de parantez opsiyoneldir istersen kullanabilirsin.kullanman tavsiye edilir karismaz ama if de parantez sart

         */
    }
}
