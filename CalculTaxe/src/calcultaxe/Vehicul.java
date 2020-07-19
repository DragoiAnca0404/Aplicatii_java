/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcultaxe;

public abstract class Vehicul implements CalculTaxe{
    protected double pret;
    protected String fabricant;
    protected String tara;
                                                                           
    public Vehicul (double pret,String fabricant,String tara){
    this.pret=pret;
    this.fabricant=fabricant;
    this.tara=tara;
}
    @Override
    public double calculeazaTVA(){
        return 19*pret/100;
    }
     @Override
    public double calculeazaTaxaVama(){
        if(tara.equals("Romania"))
            return 0;
        else return 10*pret/100;
    }
    @Override
    public double calculeazaTotal(){
        return calculeazaTVA()+calculeazaTaxaVama()+calculeazaTaxaDrum();
    }
0} 