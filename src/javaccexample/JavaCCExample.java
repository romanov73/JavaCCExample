/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaccexample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author orion
 */
public class JavaCCExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Calculator parser = new Calculator(System.in);
        try {
            parser.expr();
        } catch (ParseException ex) {
            Logger.getLogger(JavaCCExample.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }
    
}
