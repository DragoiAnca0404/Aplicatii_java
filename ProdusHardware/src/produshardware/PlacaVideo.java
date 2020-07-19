
package produshardware;


public class PlacaVideo extends ProdusHardware{
    public static double valuta=4.87d;
    public static int punctajMaxim=100;
    public PlacaVideo(double pretValuta,double punctaj){
        super(pretValuta,punctaj);
    }
    public void calculeazaPretInLei(){
        pretLei=pretValuta*valuta;
    }
    @Override
    public void calculeazaPerformanta(){
        performanta=punctaj/punctajMaxim*100;
    }
}
