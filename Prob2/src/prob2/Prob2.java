
package prob2;
import java.io.*;
public class Prob2 {

   public boolean verifica(int nr){
       for(int i=2;i<=nr/2;i++)
           if(nr%i==0) return false;
       return true;
   }
   public void scrie(){
       try{
           BufferedWriter bw=new BufferedWriter(new FileWriter("Nr.txt"));//creaza automat fisierul
           for(int i=1;i<100;i++){
               if(verifica(i)) {
               bw.write(i);
               bw.newLine();
           }
       }
       bw.close();
   }
   catch(IOException e){
    System.out.println(e.getMessage());
}
}
    
public static void main(String[] args){
    Prob2 obj=new Prob2();
    obj.scrie();}
}