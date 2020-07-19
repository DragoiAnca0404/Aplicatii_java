package imprumut;
import javax.swing.*;

public class Persoana {
    private String nume,prenume,adresa;
    private Imprumut imp;
    public Persoana(String nume,String prenume,String adresa){
        this.nume=nume;
        this.prenume=prenume;
        this.adresa=adresa;}
public void realizeazaImprumut(double suma,String frecventa){
    String s=JOptionPane.showInputDialog("Scopul imprumutului:a/p");
    if(s.equals("a"))
        imp=new ImprumutApartament(suma,frecventa);
    else if(s.equals("p"))
        imp=new ImprumutProdusCasnic(suma,frecventa);
    else
        imp=new Imprumut(suma,frecventa);
    //calculeaza rata+polimorfism dinamic
    //check variabila imprumut 
imp.CalculeazaRata();

    }

public  Imprumut getImprumut(){
 return imp;   
    
}
public String toString(){
 return("Imprumut realizat este:"+nume+" "+prenume+imp.toString());   
}
}

