/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp06.pkg2;

import Exp06.pkg1.AccessSpecifiers;

/**
 *
 * @author shail
 */
public class AccessSpecifiersMain {
    
    public static void main(String[] args) {
        
        AccessSpecifiers ob=new AccessSpecifiers(1, 2, 3, 4);
        System.out.println(ob);
        System.out.println(ob.b);//public are accessible in another class within the same package,
    }
    
}
