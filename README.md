ATM System

Overview

The ATM System is a simple console-based Java application that simulates basic banking operations such as depositing, withdrawing, and checking account balances. It demonstrates object-oriented programming principles, including abstraction, inner classes, and anonymous classes. The project is designed for educational purposes and can be extended with additional features like user authentication, transaction history, or a graphical user interface.

Features





Create an account with an initial balance.



Deposit money into the account.



Withdraw money (with insufficient funds check).



Display the current balance.



Simple text-based menu for user interaction.

Prerequisites

To run this project, ensure you have the following installed:





Java Development Kit (JDK): Version 8 or higher (JDK 17 recommended).



Integrated Development Environment (IDE): Optional, but recommended (e.g., IntelliJ IDEA, Eclipse, or NetBeans).



Git: To clone the repository (optional).

You can verify your Java installation by running:

java -version
javac -version

Installation





Clone the Repository:

git clone [(https://github.com/preshstoner/atmSystem.git)](https://github.com/preshstoner/atmSystem.git)
cd atm-system



Project Structure: Ensure the following files are in the src/atmsystem directory:





Account.java: Abstract class defining account properties and methods.



AtmSystem.java: Main class containing the application logic and user interface.



Bank.java: Class for bank information and account details.



Compile the Project: Navigate to the src directory and compile the Java files:

cd src
javac atmsystem/*.java



Run the Project: Run the main class:

java atmsystem.AtmSystem

Alternatively, use your IDE to compile and run AtmSystem.java.

Usage





Launch the application by running AtmSystem.java.



The program displays a welcome message and prompts for the account holder's name.



Enter your name to proceed.



Use the menu to:





1: Deposit: Enter an amount to deposit.



2: Withdraw: Enter an amount to withdraw (ensures sufficient funds).



3: Balance: View the current balance.



4: Exit: Exit the application.



Follow the prompts to perform transactions.

Example interaction:

Welcome To The Bank App
Enter account holder name: John Doe
Welcome, John Doe! Please choose an option.
1: Deposit.
2: Withdraw
3: Balance
4: Exit
Choose an option:
1
Enter Deposit Amount
1000
Deposited: NGN1000.0

Project Structure

atm-system/
├── src/
│   └── atmsystem/
│       ├── Account.java       # Abstract class for account operations
│       ├── AtmSystem.java     # Main class with application logic
│       └── Bank.java          # Class for bank and account details
├── README.md                  # Project documentation

Contributing

We welcome contributions to enhance the ATM System! To contribute:





Fork the Repository: Create a fork on GitHub.



Clone Your Fork:

git clone https://github.com/your-username/atm-system.git



Create a Branch:

git checkout -b feature/your-feature-name



Make Changes: Add features, fix bugs, or improve documentation.



Test Your Changes: Ensure the application compiles and runs without errors.



Commit and Push:

git commit -m "Add your feature or fix"
git push origin feature/your-feature-name



Submit a Pull Request: Open a pull request on GitHub with a clear description of your changes.

Contribution Ideas





Add user authentication (e.g., PIN or password).



Implement transaction history.



Add support for multiple accounts.



Create a graphical user interface (e.g., using JavaFX or Swing).



Add input validation for negative amounts or non-numeric inputs.

Code Overview





Account.java: An abstract class defining the balance property and abstract methods deposit and withdraw. Includes a concrete displayBalance method.



AtmSystem.java: The main class that:





Prompts for the account holder's name.



Creates an anonymous Account instance with an initial balance of NGN50,000.



Implements a Transaction inner class for handling user input and menu operations.



Bank.java: Contains:





A static BankInfo class to display a welcome message.



An AccountDetails inner class to manage the account holder's name.

Known Issues





Limited input validation (e.g., negative amounts or non-numeric inputs may cause errors).



Single-account support only.



No persistent storage for account data.

License

This project is licensed under the MIT License. See the LICENSE file for details.

Contact

For questions or suggestions, open an issue on GitHub or contact preshstoner@gmail.com.
