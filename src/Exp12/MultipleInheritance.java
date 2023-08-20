/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp12;

/**
 *
 * @author shail
 */
public class MultipleInheritance {
    
    
    public static void main(String[] args) {
        
            X ob=new X();
            ob.greet();
            ob.wave();
            ob.thank();
    }
    
    
}

class A{
    
    public void greet()
    {
        System.out.println("Good Morning");
    }
}

interface B{
    
    public void wave();
   
}

interface C{
    public void thank();
}

class X extends A implements B,C
{

    public void wave()  {
        System.out.println("Hiii");
    }

    @Override
    public void thank()
     {
        System.out.println("Thank You");
    }
    
    
}