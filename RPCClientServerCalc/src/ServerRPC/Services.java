/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerRPC;

/**
 *
 * @author apple
 */
public class Services {

    public float implementsCal(String var1, String operasi, String var2) {
       float result = 0;
       switch(operasi){
           case "+":
               result = Integer.parseInt(var1) + Integer.parseInt(var2);
               break;
           case "-" :
               result = Integer.parseInt(var1) - Integer.parseInt(var2);
               break;
           case "*" :
               result = Integer.parseInt(var1) * Integer.parseInt(var2);
               break;
           case "/" :
               result = Integer.parseInt(var1) / Integer.parseInt(var2);
               break;
       }
               
        return result;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
