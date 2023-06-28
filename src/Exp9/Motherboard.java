/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp9;

/**
 *
 * @author shail
 */
public class Motherboard {
    
    static class USB{
        
        int usb2=2;
        int usb3=1;
        
        int getTotalPorts()
        {
            return usb2+usb3;
        }
    }
    
}
