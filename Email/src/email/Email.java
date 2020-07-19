
package email;
import java.awt.*;
import java.awt.event.*;
public class Email extends Frame {
private TextField[] textfields=new TextField[4];
private TextArea ta;
private Button b;

public Email(){
    super("Email");
    Panel p1= new Panel(new GridLayout(4,2,10,10));
    p1.add(new Label("to"));
    textfields[0]=new TextField(20);
    p1.add(textfields[0]);
    p1.add(new Label("cc"));
    textfields[1]=new TextField(20);
    p1.add(textfields[1]);
    p1.add(new Label("bcc:"));
    textfields[2]=new TextField(20);
    p1.add(textfields[2]);
    p1.add(new Label("Subject"));
    textfields[3]=new TextField(20);
    p1.add(textfields[3]);
    this.add(p1,BorderLayout.NORTH);
    ta=new TextArea(50,75);
    this.add(ta,BorderLayout.CENTER);
    Panel p2=new Panel();
    b=new Button("Send");
    p2.add(b);
    this.add(p2,BorderLayout.SOUTH);
    
    
}
    public static void main(String[] args) {
        Frame f=new Email();
        f.setSize(300,400);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter(){
        public void WindowClosing(WindowEvent e){
            System.exit(0);
        }
        
        });
    }
    
}
