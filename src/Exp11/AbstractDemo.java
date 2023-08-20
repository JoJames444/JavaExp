/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp11;

/**
 *
 * @author shail
 */
public class AbstractDemo {
    
    
    public static void main(String[] args) {
        //BankAccount ob=new BankAccount()
    }
    
}

abstract class BankAccount{
    int account_no;
    double balance;

    public BankAccount(int account_no, double balance) {
        this.account_no = account_no;
        this.balance = balance;
    }
    
    
    
    public void deposit(double amount){
        balance += amount;
    }
    
    abstract public void withdraw(double amount);
    
}

class SavingAccount extends BankAccount{
    
    public SavingAccount(int account_no, double balance) {
        super(account_no, balance);
    }

    @Override
    public void withdraw(double amount) {
        
        if(balance - 500 >= amount){
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
       
    }
    
    
}

class CurrentAccount extends BankAccount{
    
    public CurrentAccount(int account_no, double balance) {
        super(account_no, balance);
    }

     public void withdraw(double amount){
        if(balance + 1000 >= amount){
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    
   
    
    
}
