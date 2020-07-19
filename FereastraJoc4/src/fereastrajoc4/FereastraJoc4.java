/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fereastrajoc4;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author student
 */
public class FereastraJoc4 extends Frame {
private Label l1,l2;
private TextField t;
private int n1,n2;

public FereastraJoc4(){
    super("Invatam inmultirea! ^^");
    Panel p=new Panel();
    n1=(int)(Math.random()*8+2);
    n2=(int)(Math.random()*8+2);
    
    l1=new Label("Cat face?"+n1+"ori"+n2+"?");
    p.add(l1);
    t=new TextField(10);
    p.add(t);
    add(p,BorderLayout.NORTH);
    
    l2=new Label();
    add(l2);
    Ascultator a=new Ascultator();
    t.addActionListener(a);

}
private class Ascultator implements ActionListener{
    private int nr;
    @Override
    public void actionPerformed(ActionEvent e){
        nr=Integer.parseInt(t.getText());
        if(nr!=n1*n2)
       l2.setText("Ai gresit.Mai incearca!");
       else l2.setText("Corect!Treci la urmatorul exercitiu");
       n1=(int)(Math.random()*8+2);
       n2=(int)(Math.random()*8+2);
       l1.setText("Cat face" +n1+"ori"+n2+"?");

       
       
        
    }

}
  
    public static void main(String[] args) {
 Frame f=new FereastraJoc4();
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);    }
    
});
               
 }
}
