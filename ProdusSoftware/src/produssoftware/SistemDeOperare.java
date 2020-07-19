
package produssoftware;


public class SistemDeOperare extends ProdusSoftware{
    public SistemDeOperare(int cod,String denumire,double pret){
        super(cod,denumire,pret);
    }
    
    public void calculeazaPretNou(){
        pret=pret-pret*34/100;
    }
    
}
