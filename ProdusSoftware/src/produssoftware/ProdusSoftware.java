
package produssoftware;


public abstract class ProdusSoftware {
private int cod;
private String denumire;
protected double pret;

public ProdusSoftware(int cod,String denumire,double pret){
    this.cod=cod;
    this.denumire=denumire;
    this.pret=pret;

    
    
}
public int getCod(){
    return cod;
}
public String getDenumire(){
    return denumire;
}
public double getPret(){
    return pret;
}
public abstract void calculeazaPretNou();
public String toString(){
            return "Produs de tip:" +this.getClass().getName()+" cu codul:"+this.getCod()+"denumire produs:"+this.getDenumire()+"are pretul initial:"+this.getPret();
}    
}
