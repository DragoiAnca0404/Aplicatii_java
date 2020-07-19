package Ex2;
public class TestProdus{
    public static void main(String[] args) {
        Produs p1=new Produs ("Mar",1);
        p1.afiseazaProdus();
          p1.aplicaReducere(15);
          p1.afiseazaProdus();
          p1.setPretUnitar(0.75);
        
     System.out.println("Pretul unitar la mere="+p1.getPretUnitar());
     Produs p2=new Produs("Pere",1.30);
     p1=p2;
        
    }
}