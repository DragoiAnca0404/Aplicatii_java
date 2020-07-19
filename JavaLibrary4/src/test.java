/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class test {
   public static void main(String[] args){
    String nr = "123,560"; 
    String ER1 = "[1-9][0-9]*";
    String ER2 = "[1-9][0-9]*,[0-9]*[1-9]";
    String ER = "("+ER1+")|("+ER2+")";
    System.out.println(nr.matches(ER));
    
   }
}
   
