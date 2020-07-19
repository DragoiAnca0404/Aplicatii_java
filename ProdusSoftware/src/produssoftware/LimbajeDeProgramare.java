
package produssoftware;

public class LimbajeDeProgramare extends ProdusSoftware {
    public LimbajeDeProgramare(int c,String d,double s){
        super(c,d,s);
    }
    public void calculeazaPretNou(){
        pret-=pret*7/100;
    }
    
}
