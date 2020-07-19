
package imprumut;


public class TestImprumut {
    public static void main(String[] args) {
        Persoana p1=new Persoana("Ion","Popescu","Str 1 Dec");
        p1.realizeazaImprumut(200000,"trimestrial");
        p1.getImprumut().platesteRata();
        System.out.println("Suma ramasa este:"+p1.getImprumut().getSumaNeplatita());
        System.out.println(p1.toString());
    }
}
