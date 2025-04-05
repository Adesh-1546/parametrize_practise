package com.assignment.constructor.prac;

public class Main_1 {
	public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("1234567890", "John Doe", 500.00);

        // Display initial details
        account.displayAccountDetails();

        System.out.println("\n--- Performing Transactions ---");

        // Perform some transactions
        account.deposit(150.00);
        account.withdraw(100.00);
        account.withdraw(600.00); // Should fail due to insufficient balance
        account.deposit(-50.00);  // Should fail due to negative deposit

        // Display final account details
        System.out.println("\n--- Final Account Details ---");
        account.displayAccountDetails();
    }

}
