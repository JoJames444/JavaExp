/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp06.pkg1;

/**
 *
 * @author shail
 */
public class AccessSpecifierSubClass extends AccessSpecifiers{
    
    public AccessSpecifierSubClass(int a, int b, int c, int d) {
        super(a, b, c, d);
    }
    
    public void print(){
        System.out.println(a+"->"+b+"->"+d);//default, public and protected are accessible in another class within the same package,
    }
    
    public static void main(String[] args) {
        AccessSpecifierSubClass obj=new AccessSpecifierSubClass(1, 2, 3, 4);
        obj.print();
    }
    
}
