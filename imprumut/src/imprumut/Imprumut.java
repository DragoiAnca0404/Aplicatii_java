
package imprumut;


public class Imprumut {
private static int id=1;//numarul la primul imprumut
private int numar;
public double rata;
public double suma;
protected double nota;
private double sumaNeplatita;
protected String frecventa;
    public Imprumut(double suma,String frecventa){
        this.suma=suma;
        //new doar la obiecte si tablouri
        this.frecventa=frecventa;
        //al catelea imprumut a fost creat
        //numar are valore proprie pentru fiecare obiecte 
        //daca pun ++ face 1 pentru fiecare obiect
        numar=id;
        id++;
        this.sumaNeplatita=suma;}
    
        public void CalculeazaRata(){
            rata=suma%10;
        } 
public void platesteRata(){
    sumaNeplatita-=rata;}
public double getSumaNeplatita(){
    return sumaNeplatita;
}
public double getSuma(){
    return suma;
}
@Override
    public String toString() {
    StringBuffer buf=new StringBuffer();
    buf.append(getClass().getName()+"suma imprumuta"+suma);
    buf.append("rata de plata este"+rata);
    buf.append("mai are de platit" +sumaNeplatita);
    buf.append("frecventa de plata este" +frecventa+"\n");
    return buf.toString();
    
}
}
        
    
        
    
