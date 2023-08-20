/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp08;

/**
 *
 * @author shail
 */
public class Fibbonaci {
    
    static int fib(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
            
    }
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }
    
}
