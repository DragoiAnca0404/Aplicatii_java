/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carte;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


/**
 *
 * @author student
 */
public class ColectieCarti {
    
    private ArrayList<Carte> al;
    public ColectieCarti(){
        al=new ArrayList<>();
        File f=new File("carti.txt");
        File f2=new File("preturi.txt");
        String linie;
        String[] s;
        
        if(f.exists()){
            try{
               BufferedReader br2=new BufferedReader(new FileReader(f2));
               //while()

                BufferedReader br=new BufferedReader(new FileReader(f));
                while(br.ready()){
                    linie=br.readLine();
                    s=linie.split("[.]");
                    al.add(new Carte(s[0],s[1],s[2]));
                }
                br.close();
            }catch(IOException e){e.printStackTrace();
            
        }
        }
            else System.out.println("Fisierul nu exista");}
    
        public int getNrCarti(){
            return al.size();
        } 
        public Carte getCarte(String titlu){
            for(Carte c:al)
                if(c.getTitle().equalsIgnoreCase(titlu))
                    return c;
            return null;
        }
        public String getCarte(int poz){
            if(poz>=0 && poz<al.size())
                return al.get(poz).toString();
            return " ";
        }
}

