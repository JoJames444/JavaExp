/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp11;

import java.util.Scanner;

/**
 *
 * @author shail
 */


class A
{
    public void print()
    {
        System.out.println("A ---> Hello");
    }
}

class B extends A
{
    public void print()
    {
        System.out.println("B ---> Hi");
    }
}

class C extends B
{
    public void print()
    {
        System.out.println("C ---> Bye");
    }
}

public class MultiLevelInheritance {
    
    
    public static void main(String[] args) {
        
        A obA = new A();
        B obB = new B();
        C obC = new C();
        
        obA.print();
        obB.print();
        obC.print();
        
        
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        
        A ref;
        if(x%2 == 0)
            ref = obB;
        else
            ref = obC;
        
        ref.print();
        
    }
    
}
