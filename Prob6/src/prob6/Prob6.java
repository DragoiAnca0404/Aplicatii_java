
package prob6;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Prob6 extends Frame{
    private TextField t1,t2;
    private Button b1,b2,b3,b4;
    private Label l;
    public Prob6(){
        super("Operatie aritmetica");
        Panel p1=new Panel();
        p1.add (new Label("Introduceti cele doua numere"));
        add(p1,BorderLayout.NORTH);
        Panel p2=new Panel();
        t1=new TextField(20);
        p2.add(t1);
        t2=new TextField(6);
        p2.add(t2);
        this.add(p2,BorderLayout.CENTER);
        Panel p3=new Panel();
        b1=new Button("Aduna");
        b2=new Button("Scade");
        b3=new Button("Inmulteste");
        b4=new Button("Impartire");
        AscultatorButoane ab=new AscultatorButoane();
        b1.addActionListener(ab);
        b2.addActionListener(ab);
        b3.addActionListener(ab);
        b4.addActionListener(ab);
        l=new Label("Rezultat:");
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p3.add(l);
        this.add(p3,BorderLayout.SOUTH);

        

        
        
    }
    private class AscultatorButoane implements ActionListener{
        private int nr1, nr2, rez;
       

        @Override
        public void actionPerformed(ActionEvent e) {
                     l.setText("Rezultat:");
                     nr1=Integer.parseInt(t1.getText());
                     nr2=Integer.parseInt(t2.getText());
                     switch(e.getActionCommand()){
                         case "Aduna":rez=nr1+nr2;break;
                         case "Scade":rez=nr1-nr2;break;
                         case "Inmulteste":rez=nr1*nr2;break;
                         case "Impartire":rez=nr1/nr2;
                     }
                     l.setText("Rezultat:" +rez);
   
        }
    }
    public static void main(String[] args) {
        Prob6 f1=new Prob6();
        f1.setSize(400,250);
        f1.setVisible(true);
        f1.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
        
        });
    }
  
}
