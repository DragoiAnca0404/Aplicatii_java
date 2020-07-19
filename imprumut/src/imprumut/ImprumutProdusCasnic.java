
package imprumut;


public class ImprumutProdusCasnic extends Imprumut{
    public ImprumutProdusCasnic(double suma,String frecventa){
        super(suma,frecventa);
    }
    public void calculeazaRata(){
        if(frecventa.equalsIgnoreCase("semestrial")){
            rata=rata*6;
            rata+=(rata/7/100);
        }
      
    }
    
}
 