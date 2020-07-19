
package problema1;

public class Problema1 {
 private int [] t;
 public Problema1(){
    t=new int[20];
  
        
    }
 public void umpleTablou()
 {
     for(int i=0;i<t.length;i++){
         t[i]=(int)(Math.random()*91+10);
         if(i==0) System.out.print(t[i]+ " ");
         else{
             for(int j=0;j<0;j++){
                 if(t[j]==t[i]) break;
                 if(j==i-1)
                     System.out.print(t[i]+" ");
             }
         }
     }
 }
    
}
