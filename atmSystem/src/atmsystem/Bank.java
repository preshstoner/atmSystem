/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmsystem;

/**
 *
 * @author USER
 */
public class Bank {
    public static class BankInfo{
        public static void bankDetails(){
            System.out.println("Welcome To The Bank App");
        }
    }
    
    private String accountHolder;
    
    public class AccountDetails{
        public void setAccountHolder(String name){
            accountHolder = name;
        }
        
        public void displayAccountHolder(){
            System.out.println("Account Holder: " +accountHolder);
        }
    }
   
}
