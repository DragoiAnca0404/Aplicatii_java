/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelnumeretelefon;


public class Abonat {
    
    private int cod;
    private ModelNumereTelefon numar;
    private Persoana p;
    private static int id=1;
    public Abonat(String t,String numar,String n,String pn)
    {
        cod=id++;
        numar=new ModelNumereTelefon(t,j,numar);
        p=new Persoana(n,pn);    
    }
    public int getCod(){
        return cod;
    }
    
public ModelNumereTelefon getNumarTelefon(){
    return numar;
}    
public String getDateAbonat(){
    StringBuffer sb= new StringBuffer(p.getDataPersoana());
    sb.append(" "+numar.converteste());
    sb.append("\n");
    return sb.toString();
    
}
    
}
