# 💫 CCPRGG1L FUNDAMENTALS PROGRAMMING      
### Group Name: Artificial Ledger 🇵🇭
### Group Member: 
 * ####  😎 Jay Arre Talosig
 * ####  😃 Gabriel Angelo Viñas 
 * ####  🥰 Anilove Tiquio 
 * ####  🤗 Kristine Vine Navarro 
 * ####  😌 Joshua Maquilan 
 * ####  😋 Vince Erol Pangilinan     
### Subject & Section: 🧚‍♂️ CCPRGG1L COM23P 🧚‍♀️  
### Professor: 👦 Jay D. Abaleta          

# 📊 Table of Contents

## [Introduction](#introduction)
This repository contains source code for a Java project that focuses on fundamental concepts and exercises. The code includes examples of input/output operations, arithmetic calculations, and basic Java syntax.
 
###### ⚡ Course Outline: https://nationalueduph.sharepoint.com/:w:/r/sites/FundamentalsofProgramming-CCPRGG1LCOM23P/_layouts/15/Doc2.aspx?action=edit&sourcedoc=%7B5e6c8bed-44a9-4add-a947-3c727bf33daa%7D&wdOrigin=TEAMS-MAGLEV.teamsSdk_ns.rwc&wdExp=TEAMS-TREATMENT&wdhostclicktime=1707804185955&web=1 

###### ⚡ Repository Source: https://github.com/flexycode/CCPRGG1L_FUNDAMENTALS_COM23P
  
### CCPRGG1L Table lecture

| Topic                                   | Description                                                     |
| :------------------------------------- | :-------------------------------------------------------------- |
| Part 1 - Introduce Basic Programming    | Introduction to Basic programming Variables and Type             |
| Part 2 - Java Programming               | Problem-solving phases                                          |
| Part 3a - Understand the basic concepts of Object-Oriented Programming (OOP) | Compare Procedural and OOP |
| Part 3b - Learn how to declare and use classes and objects in Java         | Introduction to objects and classes                              |
| Part 4 - Learn how to implement user-defined methods | Primitive types and String Class, Basic Operators (Arithmetic, Relational, and Logical) |
| Part 5 - Identify the types of variables and its scope | Class Methods, Variables Scoping |
| Part 6 - Sequential, conditional, and iteration structure | Sequential Structure |
| Part 7 - Learn the difference between sequential, conditional, and iteration structure | Conditional Structure |
| Part 8 - Learn how to use various conditional structures | Sequential vs Conditional Structure |
| Part 9 - Learn the difference between sequential, conditional, and iteration structure | Sequential vs Conditional Structure |
| Part 10 - Learn how to use various iteration structures | Sequential vs Conditional Structure |
| Part 11 - Learn built-in mathematical function in the Java Math Class Library | String and char operations |
| Part 12 - Learn built-in mathematical function in the Java Math Class Library | Arrays and Array list |


# Banking System

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction
Welcome to the Banking System! This system allows users to perform various banking activities such as creating accounts, depositing/withdrawing money, checking balances, and displaying account details. A banking program in Java, that the users can do the following banking activities like creating accounts, depositing/withdrawing money, checking balance, and displaying account details.

## Features
- Create new bank accounts with unique account numbers and account holder names.
- Deposit money into existing accounts.
- Withdraw money from existing accounts, with checks for sufficient balance.
- Check the current balance of an account.
- Display detailed information about an account.

### Tree Diagram Details 

Banking System
```bash
├── Account 
│   ├── AccountNumber
│   ├── AccountHolderName 
│   ├── Balance
│   ├── createAccount() 
│   ├── deposit()
│   ├── withdraw()
│   └── displayAccountDetails()
└── BankingProgram 
    ├── accounts[]
    ├── createAccount()
    ├── deposit()
    ├── withdraw()
    ├── checkBalance()
    └── displayAccountDetails()
```

### Tree Diagram Simple Structure
```bash
BankingSystem 
├── Account
└── BankingProgram 
```
#### Tree Diagram 
```
BankingSystem.java 
├── Account.java  
└── BankingProgram.java 
```

In this structure, BankingSystem is the parent class that contains an array of Account objects and methods to manage those accounts. Account is a separate class that represents a bank account and contains methods to perform operations on the account. BankingProgram is the main class that includes the main() method and handles user interaction.

The BankingSystem class is the central component that connects the Account class and the BankingProgram class. It manages the accounts using the array and provides methods to perform operations on those accounts.

#### Program Structure

* `Control Structures`: The BankingProgram class includes a do-while loop with a switch statement that allows users to make choices and perform different actions based on their input. This demonstrates the use of control structures to control the flow of the program.

* `Methods`: All three classes (Account, BankingProgram, and BankingSystem) contain multiple methods that perform specific actions. For example, the Account class has methods like deposit(), withdraw(), checkBalance(), and displayAccountDetails(). The BankingSystem class has methods like createAccount(), deposit(), withdraw(), checkBalance(), and displayAccountDetails(). The BankingProgram class has the main() method. These methods encapsulate specific functionalities and promote code reusability.

* `Array`: The BankingSystem class includes an array called accounts[] to store instances of the Account class. The array is used to manage multiple accounts, such as creating new accounts, accessing specific accounts, and performing operations on them.

# ✍️ Code Structure Explanation  

#### Banking System 🌐
```
`BankingSystem.java` <------- This Part :) 
├── Account.java   
└── BankingProgram.java  
```
The `BankingSystem` class manages the array of `Account` objects and provides methods to create accounts, deposit/withdraw money, check balances, and display account details.

It includes the following methods: 
 
* `createAccount(int accountNumber, String accountHolderName, double balance)`: Creates a new account with the given account number, account holder name, and initial balance. The account is added to the `accounts` array.

* `deposit(int accountNumber, double amount)`: Deposits the specified amount into the account with the given account number. If the account is found, the `deposit()` method of the `Account` class is called.

* `withdraw(int accountNumber, double amount)`: Withdraws the specified amount from the account with the given account number. If the account is found, the `withdraw()` method of the `Account` class is called.

* `checkBalance(int accountNumber)`: Checks and displays the balance of the account with the given account number. If the account is found, the checkBalance() method of the Account class is called.

* `displayAccountDetails(int accountNumber)`: Displays the details of the account with the given account number. If the account is found, the displayAccountDetails() method of the Account class is called.

* `findAccount(int accountNumber)`: Searches for an account with the given account number in the `accounts` array. Returns the account if found, or `null` if not found.

#### Account 🕵️ 

```
BankingSystem.java  
├── Account.java   <------- This Part :) 
└── BankingProgram.java  
```

#### Banking Program 💱 

```
BankingSystem.java 
├── Account.java     
└── BankingProgram.java  <------- This Part :)
```


## Installation  
1. Clone the repository to your local machine.
2. Open the project in your preferred programming environment.
3. Build the project to compile the source code.

## Usage
1. Run the `BankingProgram` class to start the program. 
2. Follow the on-screen menu options to perform various banking activities.
3. Enter the required information when prompted, such as account numbers, account holder names, deposit/withdrawal amounts, etc.
4. View the program's output to see the results of each operation.

# 🏆 Contributing  

## Contributing 
If you would like to contribute to the Banking System, please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push your changes to your forked repository.
5. Submit a pull request to the main repository.
6. REMINDER DON'T COMMIT IN THE MAIN BRANCH!!!~ just pull request only and we will review it first.


### 🧠 Submitting Changes

🧠 Contributions are welcome! If you have ideas for improvements or want to add more exercises, follow these steps:

1. Fork the repository.
2. Create a new branch.
3. Make your changes and commit them.
4. Push to your fork and submit a pull request.

### 🛸 Reporting Issues

###### 🤖 If you encounter any issues or have suggestions, please open an issue to let us know.

# 🔑 License 


## License
The Banking System is licensed under the [MIT License](https://opensource.org/licenses/MIT).
This project is licensed under the MIT License and National University.


# 📫 Changelogs     
## [1.0.0] - 2024-02-25     
### Added
- 📫 Uploaded the Project Requirements
- 📫 Created the Project Documentation
- 📫 Added breakdown and documentation
- 📫 Added a function for default Bank Account profile. 

### Changed
- 📫 Revised all java source code file
- 📫 Changed some variable and array
- 📫 Changed the value and function for class method in the BankingProgram.java 

### Fixed
- 📫 Fixed some error in java methods and classes
- 📫 Fixed the name of the Main Branch for debugging and run the code. BankingProgram will be the main branch while BankingSystem will be the sub-branch.

### Problem
- 📫 There's an overall issue from this code

#### [Back to Table of Content](#introduction)

