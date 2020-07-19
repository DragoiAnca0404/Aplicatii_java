/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import javax.swing.JOptionPane;
public class Problema2 {

    
public static double celsius(double f)
{double c;
    return c=5.0/9*(f-32);
}

public static double fahrenheit(double c)
{double f;
    return f=9.0/5*c+32;
}
    
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

           
        JOptionPane.showMessageDialog(null,"Temp in Celsius:" +celsius(a));
        JOptionPane.showMessageDialog(null,"Temp in fahrenheit:" +fahrenheit(b));

  
    }
    
    
}
