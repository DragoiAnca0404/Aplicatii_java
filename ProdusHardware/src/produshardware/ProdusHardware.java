
package produshardware;


public abstract class ProdusHardware {
protected double pretValuta;
protected double pretLei,punctaj,performanta;
public ProdusHardware(double pretValuta,double punctaj){
    this.pretValuta=pretValuta;
    this.punctaj=punctaj;
    
    
}
public abstract void calculeazaPerformanta();
public double CalculeazaRaportPretLeiPerformanta(){
    return pretLei/performanta;
}
public String toString(){
    return"Produs de tip:"+this.getClass().getName()+"cost in valuta"+pretValuta+"costa in lei"+pretLei+"cu punctajul:"+punctaj+"cu performanta"+performanta;
}  
    
}
