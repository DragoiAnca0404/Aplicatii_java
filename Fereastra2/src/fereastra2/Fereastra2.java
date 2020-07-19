/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fereastra2;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author student
 */
public class Fereastra2 extends Frame{
private TextField t;
private Checkbox[] c;
public Fereastra2(){
    super("Stil font");
    t=new TextField("Modificarea stilului unui font");
    add(t,BorderLayout.NORTH);
    c=new Checkbox[4];
    CheckboxGroup cg=new CheckboxGroup();
    String[] et={"Normal","Italic","Bold","Bold/Italic"};
    Ascultator a=new Ascultator();
    Panel p=new Panel();
    for(int i=0;i<4;i++){
        c[i]=new Checkbox(et[i],cg,false);
        if(i==0)c[i].setState(true);
        c[i].addItemListener(a);
        p.add(c[i]);

    }
    add(p);
}

private class Ascultator implements ItemListener{
    private Font f;
    public void itemStateChanged(ItemEvent e){
        f=t.getFont();
        if(c[0].getState());
        t.setFont(f.deriveFont(Font.ITALIC));
        
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
