/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp14;

/**
 *
 * @author shail
 */
public class EvenNumberException extends Exception{
    
    String msg;

    public EvenNumberException(String msg) {
        
        super(msg);
        this.msg = msg;
    }
    
    public String toString()
    {
        return this.msg;
    }
    
    
}
