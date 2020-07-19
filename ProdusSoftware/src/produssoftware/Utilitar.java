
package produssoftware;


public class Utilitar extends ProdusSoftware {
    public Utilitar(int c,String d,double p){
        super(c,d,p);
        
    }
    public void calculeazaPretNou(){
        pret-=pret*4/100;
    }
    
    
}
