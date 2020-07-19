
package produssoftware;

public class Joc extends ProdusSoftware {
    public Joc(int c,String d,double p){
        super(c,d,p);
        
    }
    public void calculeazaPretNou(){
        pret-=pret*4/100;
    }
    
    
}
