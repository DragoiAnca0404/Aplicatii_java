/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carte;

/**
 *
 * @author student
 */
public class Carte {
private String titlu,autori,editura;
private int pret;
private String Valuta;

    public String getValuta() {
        return Valuta;
    }

    public void setValuta(String Valuta) {
        this.Valuta = Valuta;
    }

public Carte (String a,String t,String e){
    autori=a;
    titlu=t;
    editura=e;
}
public String getTitle(){
    return titlu;
    
}
public void setPret(int p){
    pret=p;
}
public int getPret(){
    return pret;
}
@Override
public String toString(){
    return autori+";"+titlu+";"+editura+";"+pret;
}
}
