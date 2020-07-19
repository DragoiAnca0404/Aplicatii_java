/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carte;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



/**
 *
 * @author student
 */
public class Main {
    public static void main(String[] args) {
        Fereastra f=new Fereastra();
        f.setSize(500,600);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
                
            }
        });
    }
    
}
