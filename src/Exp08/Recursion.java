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
public class Recursion {
    
    static void fun(int N)
    {
        if(N>0){
            System.out.println("Hello");
            fun(N-1);
        }
    }
    
    public static void main(String[] args) {
        
        fun(10);
    }
    
}
