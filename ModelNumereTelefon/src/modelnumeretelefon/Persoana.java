
package modelnumeretelefon;


 
public class Persoana {
    private String nume,prenume;
    public Persoana(String n,String p){
        nume=n;
        prenume=p;
        
    }
    
    public String getDataPersoana(){
        return nume+ " " +prenume;
    }
}
