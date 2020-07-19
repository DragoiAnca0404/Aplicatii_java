/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carte;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author student
 */
public class Fereastra  extends Frame{
    private List lista;
    private TextArea ta;
    private Button b;
    private Button b1;
    private ColectieCarti cc;
    public Fereastra(){
        super("Comanda carti");
        lista=new List();
        cc=new ColectieCarti();
        int nr=cc.getNrCarti();
        for(int i=0;i<nr;i++)
              lista.add(cc.getCarte(i));
        
        add(lista,BorderLayout.NORTH);
        ta=new TextArea(50,70);
        add(ta);
        Panel p=new Panel();
        b=new Button("Adauga");
        p.add(b);
        add(p,BorderLayout.SOUTH);
        Ascultator a=new Ascultator();
        b.addActionListener(a);
        
        b1=new Button("Calculeaza pret:");
        p.add(b1);
    }

    private class Ascultator implements ActionListener{
        String item;
        Ascultator(){
            ta.setText(" ");
            ta.setEnabled(false);
        }
        public void actionPerformed(ActionEvent e){
            item=lista.getSelectedItem();
            String[]s=item.split("[;]");
            ta.append(cc.getCarte(s[1])+"\n");
        }
    }
    
        
    
    
}
