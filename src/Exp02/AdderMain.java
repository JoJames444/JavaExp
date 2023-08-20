/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp02;

/**
 *
 * @author shail
 */
public class AdderMain {
    
    public static void main(String[] args) {
        
        Adder ob1 = new Adder(10, 5);
        ob1.add();
        System.out.println(ob1.getX()+" + "+ob1.getY()+" = "+ob1.getSum());
        
        ob1.setX(20);
        ob1.setY(30);
        ob1.add();
        System.out.println(ob1.getX()+" + "+ob1.getY()+" = "+ob1.getSum());
        
                
        
    }
    
}
