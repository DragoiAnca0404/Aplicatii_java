
package produshardware;


public class Test {
    public static void main(String[] args) {
        
  
    ProdusHardware[] produse=new ProdusHardware[8];
    produse[0]=new PlacaVideo(130,76);
    produse[1]=new Monitor(246,76);
    produse[2]=new PlacaVideo(180,77.79);
    produse[3]=new Monitor(224,95);
    produse[4]=new PlacaVideo(152,72.55);
    produse[5]=new Monitor(249,96);
    produse[6]=new PlacaVideo(53,54.69);
    produse[7]=new Monitor(279,107);
    for(ProdusHardware p:produse){
    p.calculeazaPerformanta();
    if(p instanceof PlacaVideo)
        ((PlacaVideo)p).calculeazaPretInLei();
    
    ((Monitor)p).calculeazaPretInLei();
    System.out.println(p.toString()+"raport=")
    
    
}
}
}