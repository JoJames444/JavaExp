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
public class Statics {
    
    int a;
    static int b;

    public Statics(int a) {
        this.a = a;
    }

    public void setB(int x) {
        b=x;
    }
    
    void printValues()
    {
        System.out.println("a = "+a+" b = "+b);
    }
    
}
