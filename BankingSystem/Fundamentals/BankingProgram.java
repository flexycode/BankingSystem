package Fundamentals;

import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("**********Banking Program***************");
            System.out.println("[1] Create Account");
            System.out.println("[2] Deposit");
            System.out.println("[3] Withdraw");
            System.out.println("[4] Check Balance");
            System.out.println("[5] Display Account Details");
            System.out.println("[0] Exit");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Account Holder Name: ");
                    String accountHolderName = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    bankingSystem.createAccount(accountNumber, accountHolderName, balance);
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bankingSystem.deposit(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bankingSystem.withdraw(accountNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    bankingSystem.checkBalance(accountNumber);
                    break;
                case 5:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    bankingSystem.displayAccountDetails(accountNumber);
                    break;
                case 0:
                    System.out.println("Thank You For Using the Banking Program");
                    System.out.println("Program Terminated Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.out.println("Please Try Again....");
                    break;
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}