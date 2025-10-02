/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmsystem;

/**
 *
 * @author USER
 */
public abstract class Account {
    protected double balance;
    
    public Account(double balance){
        this.balance = balance;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public void displayBalance(){
        System.out.println("Current Balance: NGN" +balance);
    }
    
}
