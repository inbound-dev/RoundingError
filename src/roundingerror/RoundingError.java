/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roundingerror;
import javax.swing.*;
/**
 *
 * @author joham3169
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter Any Number"));
        double b = Math.sqrt(a);
        double c = a - b * b;
        double d = Math.pow(b, 2);
        
        System.out.println("the squared of the squared: "+ d);
        System.out.println("the round off Error: "+c);
        
        
        
    }
    
}
