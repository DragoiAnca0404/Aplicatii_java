
package produshardware;


public class Monitor extends ProdusHardware {
    public static double valuta=4.2;
    public static int  punctajMaxim=150;
    public Monitor(double valuta,double punctaj){
        super(valuta, punctaj);
        
    }
   public void calculeazaPretInLei(){
       pretLei=pretValuta*valuta;
   } 
   @Override
   public void calculeazaPerformanta(){
       performanta=punctaj/punctajMaxim*100;
   }
}
