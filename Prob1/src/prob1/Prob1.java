
package prob1;
import javax.swing.*;
public class Prob1 {

 public String verifica(String s){
     int x;
     double y;
 try{
     x=Integer.parseInt(s);
    return "Sirul introdus este un numar intreg:"+x;
 }   
catch(NumberFormatException e){
    try{
        y=Double.parseDouble(s);
        return"Sirul  introdus este numarul real"+y;
    }
    catch(NumberFormatException f){
        return"Sirul introdus este alfa-numeric";
   }
  } 
 
 }
    public static void main(String[] args) {
        String s=JOptionPane.showInputDialog("Introduceti un numar intreg sau numar real sau un sir alfanumerice");
        Prob1 p=new Prob1();
        System.out.println(p.verifica(s));
    }
    
}
                
