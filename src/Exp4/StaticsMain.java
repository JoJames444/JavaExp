/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp4;

/**
 *
 * @author shail
 */
public class StaticsMain {
    
    public static void main(String[] args) {
        
        Statics ob=new Statics(2);
        ob.printValues();
        Statics.setB(5);
        ob.printValues();
        
        Statics obj=new Statics(3);
        obj.printValues();
        Statics.setB(10);
        obj.printValues();
        
        ob.printValues();
        
        
    }
    
}
