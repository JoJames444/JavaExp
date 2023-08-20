/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp14;

/**
 *
 * @author shail
 */
public class ExceptionHandling {
    
    public static void main(String[] args){
        
        int a = 52,b=5;
        
        try {
            
            if(a%2 == 0 || b%2 == 0)
                throw new EvenNumberException("One even integer found");
            
            float q = a/b;
            System.out.println("Quotient = "+q);

            int arr[] = {1,2,3,4,5};
            System.out.println("Element at 5 is "+arr[5]);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("An arithmetic exception occured  : "+ex.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("A bound exception occured  : "+ex.getMessage());
        }
        catch(EvenNumberException ex)
        {
            System.out.println("An even number exception occured  : "+ex.getMessage());
        }
                
        
        
    }

    
}
