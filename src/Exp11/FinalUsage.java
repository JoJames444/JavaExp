/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp11;

/**
 *
 * @author shail
 */
public class FinalUsage {
    
    public static void main(String[] args) {
        
        final double pie = 3.14;
        System.out.println("Pie : "+pie);
        //pie = 3.41; make an error
        System.out.println("Pie : "+pie);
        
    }
    
}

class Simple{

    final public void greet()
    {
            System.out.println("Good Morning !");
    }
}
final class Complex extends Simple{
   
    //public void greet(){} cannot overide a final method 
    
   
    public void greetings()
    {
        System.out.println("Hello! How are you ?");
    }
    
}

/*class MoreComplex extends Complex ... cannot inherit as the parent class if c[               
{
    
}
*/


