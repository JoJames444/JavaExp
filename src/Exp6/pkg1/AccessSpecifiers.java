/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp6.pkg1;

/**
 *
 * @author shail
 */
public class AccessSpecifiers {
    
    int a; //default
    public int b; //public
    private int c; //private
    protected int d; //protected

    public AccessSpecifiers(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return a+"->"+b+"->"+c+"->"+d; //To change body of generated methods, choose Tools | Templates.
    }
    
}
