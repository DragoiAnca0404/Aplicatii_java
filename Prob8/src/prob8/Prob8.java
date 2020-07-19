
package prob8;

import java.awt.*;
public class Prob8 extends Frame {
    private Checkbox[] cb;
    private Button[] b;
    public Choice c;
    public Prob8(){
        super("Print");
        this.add(new Label("printing Options"),BorderLayout.NORTH);
        Panel p1=new Panel(new GridLayout(3,2,10,10));
        String[] et1={"Image","Selection","Text","All","Code","Applet","Print to file"};
        cb=new Checkbox[7];
        CheckboxGroup cbg=new CheckboxGroup();
        for(int i=0;i<6;i++){
            if(i%2==0) cb[i]=new Checkbox(et1[i]);
            else cb[i]=new Checkbox(et1[i],false,cbg);
          p1.add(cb[i]);
        }
        add(p1);
        Panel p2=new Panel(new GridLayout(4, 1, 0, 10));
        b=new Button[4];
        String[] et2={"Ok","Cancel","Setup","Help"};
        for(int i=0;i<4;i++){
            b[i]=new Button(et2[i]);
            p2.add(b[i]);
        }
        add(p2, BorderLayout.EAST);
        cb[3].setState(true);
        Panel p3=new Panel();
        p3.add(new Label("Print Quality"));
        c=new Choice();
        c.add("Normal");
        c.add("Fast");
        c.add("Best");
        p2.add(c);
        cb[6]=new Checkbox(et1[6]);
        p3.add(cb[6]);
        this.add(p3,BorderLayout.SOUTH);
    }


    
}
