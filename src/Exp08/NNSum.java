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

/*

S(1) = 1
S(2) = 2 + 1
S(2) = 2 + s(1)
S(3) = 3 + 2 + 1
S(3) = 3 + S(2)
S(4) = 4 + 3 + 2 + 1
S(4) = 4 + S(3)
S(5) = 5 + 4 + 3 + 2 + 1
S(5) = 5 + S(4)
.
.
.
S(n) = n + S(n-1)






*/
public class NNSum {
    
    
    static int sum(int n)
    {
        if(n==1)
            return 1;
        else
            return n+sum(n-1);
    }
    
    public static void main(String[] args) {
        
        System.out.println("S(10) = "+NNSum.sum(10));
    }
    
    
}

