package Ex2;
public class Produs {
    
    private String denumire;
    private double pretUnitar;
    public Produs (String d,double p){
        denumire=d;
        pretUnitar=p;
    
    
}
    public void afiseazaProdus(){
        System.out.println(denumire +" "+pretUnitar);
    }
    
    public void setPretUnitar(double pn){
        if(pn>0) pretUnitar=pn;
        else System.out.println("Eroare a val parametrului pn");
          
    }
    public double getPretUnitar(){
        return pretUnitar;
    }
    public void aplicaReducere(int pr){
        if(pr>1){
            double reducere=pr*pretUnitar/100;
            pretUnitar-=reducere;
        }
        else System.out.println("Eroare prod");
    }
    
}


