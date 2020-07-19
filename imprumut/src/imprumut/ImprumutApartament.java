
package imprumut;



public class ImprumutApartament extends Imprumut {
    public ImprumutApartament(double suma,String frecventa){
        super(suma,frecventa);}
    public void CalculeazaRata(){
        super.CalculeazaRata();
            //initializam cu rata lunara apelam metoda calculeaza rata,dar din imprumut
            //super-solution
            if(frecventa.equalsIgnoreCase("trimestrial")){
                rata=rata*3;
                rata+=(rata*3/100);
            }
        }
   }

    

