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
public class AccessSpecifiersMain {
    
    public static void main(String[] args) {
        
        AccessSpecifiers ob=new AccessSpecifiers(1, 2, 3, 4);
        System.out.println(ob);
        System.out.println(ob.a+" "+ob.b+" "+ob.d);//default, public and protected are accessible in another class within the same package,
    }
    
}
