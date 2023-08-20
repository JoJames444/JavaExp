/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp04;

/**
 *
 * @author shail
 */
public class StaticsMain {
    
    public static void main(String[] args) {
        
        Statics ob=new Statics(2);
        ob.printValues();
        ob.setB(5);
        ob.printValues();
        
        Statics obj=new Statics(3);
        obj.printValues();
        obj.setB(10);
        obj.printValues();
        
        ob.printValues();
        
        System.out.println("Area = "+Constants.PI*3*3);
        
        System.out.println("3.5 meters = "+Converters.meter2cm(3.5)+" cms");
        
        
    }
    
}
