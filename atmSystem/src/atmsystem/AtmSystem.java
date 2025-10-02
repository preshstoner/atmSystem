/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmsystem;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AtmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Bank.BankInfo.bankDetails();
        
        System.out.print("Enter account holder name: ");
        String name = input.nextLine();
        
        Bank bank = new Bank();
        Bank.AccountDetails details = bank.new  AccountDetails();
        details.setAccountHolder(name);
        
        Runnable welcome = new Runnable(){
            @Override
            public void run(){
                System.out.print("Welcome, "+name+" !Please chose an option. \n");
                
            }
        };
        welcome.run();
        
        Account account = new Account(50000){
            @Override 
            public void deposit(double amount){
                balance += amount;
                System.out.println("Deposited: NGN" +amount);
            }
            
            @Override
            public void withdraw(double amount){
                if(amount <= balance){
                    balance -= amount;
                    System.out.println("Withdrawn NGN" +amount);
                }else{
                    System.out.println("Insuuficeint funds");
                }
            }
        };
        
        class Transaction{
            void process(){
                while(true){
                    System.out.println("1: Deposit. \n 2: Withdraw \n 3:Balance \n 4:Exit\n");
                    System.out.println("Choose an option: ");
                    int choice = input.nextInt();
                    input.nextLine();
                    
                    if(choice == 1){
                        System.out.println("Enter Deposit Amount");
                        double amount = input.nextDouble();
                        account.deposit(amount);
                       }else if(choice == 2){
                           System.out.println("Enter Withrawal Amount");
                           double amount = input.nextDouble();
                           account.withdraw(amount);
                       }else if(choice==3){
                           account.displayBalance();
                       }else{
                           System.out.println("Thank you for Banking with us");
                           break;
                       }
                }
            }
        }
        
        Transaction transact = new Transaction();
        transact.process();
        input.close();
        
    }
    
}
