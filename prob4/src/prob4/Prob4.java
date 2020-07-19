
package prob4;
import java.io.*;

public class Prob4 {
int[] tablou=new int[10];
public String analizeaza Cuvant(String s){
    String sb=new StringBuffer();
    try{
            int x;
            x = Integer.parseInt(s);
            char c=' ';
            for(int i=0;i<s.length();i++){
                c=s.charAt(i);
                tablou[c]++;
            }
            sb.append("numar:"+s+"\n");
            sb.append("cifre:");
            for(int i=0;i<=9;i++)
                sb.append(i+" ");
            sb.append("Aparitii:");
            for(int i=0;i<=9;i++)
                sb.append(tablou[i])
    }
}
}
