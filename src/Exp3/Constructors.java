/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp3;

/**
 *
 * @author shail
 */
public class Constructors {
    
    int a;
    boolean b;

    public Constructors() {
        a=5;
        b=true;
    }
    
    public Constructors(int a, boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public Constructors(int a){
        this.a = a;
    }
    
    public Constructors(boolean b) {
        this.b = b;
    }
    
    void print(){
        System.out.println("a = "+a+" b = "+b);
    }
    
}
