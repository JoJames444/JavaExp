/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp09;

/**
 *
 * @author shail
 */
public class NestedClass {
    
    public static void main(String[] args) {
        
        CPU cpu=new CPU();
        cpu.price = 25000;
        
        CPU.Processor processor = cpu.new Processor(4, "Intel");
        CPU.RAM ram = cpu.new RAM(512,"Segate");
        
        System.out.println(processor.getCache());
        System.out.println(ram.getSpeed());
        
        Motherboard.USB usb = new Motherboard.USB();
        System.out.println(usb.getTotalPorts());
        
    }
    
}
