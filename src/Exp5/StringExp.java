package Exp5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shail
 */
public class StringExp {
    
    public static void main(String[] args) {
        
        String s1 = "shailesh";
        String s2 = "shailesh";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        
        
        String ss1 = new String("shailesh");
        String ss2 = new String("shailesh");
        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(ss1.equals(ss2));
        
        
        
        String ss3 = ss1+" sivan"; //ss1 is immutable
        System.out.println("ss1 : "+ss1);
        System.out.println("ss3 : "+ss3);
        
        
        StringBuffer sb1 = new StringBuffer("Shailesh");
        System.out.println("sb1 : "+sb1);
        sb1.append(" Sivan");
        System.out.println("sb1 : "+sb1);
        sb1.reverse();
        System.out.println("sb1 : "+sb1);
        
    }
    
}
