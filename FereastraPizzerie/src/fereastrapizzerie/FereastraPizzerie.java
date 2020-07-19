/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fereastrapizzerie;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author student
 */
public class FereastraPizzerie extends Frame {
    private TextField t1,t2,t3,t4,t5;
    private Button b;
    public FereastraPizzerie(){
        setTitle("Order Pizza");
        setLayout(new GridLayout(6,2,10,10));
        add(new Label("\" Margherita\"(5.5 euro)"));
        t1=new TextField(20);
        add(t1);
        
        add(new Label("\" Quattro Formaggi\"(4.5 euro)"));
        t2=new TextField(10);
        add(t2);
        
         add(new Label("\"  Quattro Staggioni \"(6.0 euro)"));
        t3=new TextField(10);
        add(t3);
        
         add(new Label("\" Fungghi Porcini\"(5.8 euro)"));
        t4=new TextField(10);
        add(t4);
        
         add(new Label("\"Total \" "));
        t5=new TextField(10);
        add(t5);
        
        
        
        b=new Button("Order");
        add(b);
        Ascultator a=new Ascultator();
        b.addActionListener(a);
        
    }
    private class Ascultator implements ActionListener{
        private double cost;
        public void actionPerformed(ActionEvent e){
            cost=0;
            t5.setText(" ");
            
            if(!t1.getText().equals(" "));
            cost+=Integer.parseInt(t1.getText())*5.5;
            
            if(!t2.getText().equals(" "));
            cost+=Integer.parseInt(t2.getText())*4.5;
            
            if(!t3.getText().equals(" "));
            cost+=Integer.parseInt(t3.getText())*6.0;
            
            if(!t4.getText().equals(" "));
            cost+=Integer.parseInt(t4.getText())*5.8;
            
            t5.setText(cost+" ");
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
            t4.setText(" ");

            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame f=new FereastraPizzerie();
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    
}
