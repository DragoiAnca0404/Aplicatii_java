
package prob3;
import java.io.*;

public class Prob3 {

    
 private String[] articole={"un","o","unii","unele"};
 private String[] substantive={"masina","copil","masa","pistol"};
 private String[] verbe={"calca","mananca","merge","trage","danseaza"};
 private String[] prepozitii={"pe","la","cu"};
 
public String genereazaPropozitii(){
    StringBuffer sb=new StringBuffer();
    int poz=(int)(Math.random()*articole.length);
    String a=articole[poz];
    char c=a.charAt(0);
    c=(char)(c-32);
    sb.append(c+a.substring(1)+" ");
    poz=(int)(Math.random()*substantive.length);
    sb.append(substantive[poz]+" ");
    poz=(int)(Math.random()*verbe.length);
    sb.append(verbe[poz]+" ");
    poz=(int)(Math.random()*prepozitii.length);
    sb.append(prepozitii[poz]+" ");
    poz=(int)(Math.random()*articole.length);
    sb.append(articole[poz]+" ");
        poz=(int)(Math.random()*substantive.length);
            sb.append(substantive[poz]+".\n\r ");
            return sb.toString();   
    
} 

public void scrie(){
    try{
        FileWriter fw=new FileWriter("propozitii txt",true);
        for(int i=01;i<=5;i++)
            fw.write(genereazaPropozitii());
    }catch(IOException e){e.printStackTrace();}
                    
    }
public static void main(String[] args) {
        Prob3 p=new Prob3();
        p.scrie();
        System.out.println("verifica fisierul");
    }
}         
    

