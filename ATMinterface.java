package CodSoft;
import java.util.Scanner;
class BankAccount 
	{
	    private double balance;

	    public BankAccount(double initialBalance) 
	    {
	        this.balance = initialBalance;
	    }

	    public double getBalance() 
	    {
	        return balance;
	    }

	    public void deposit(double amount) 
	    {
	        if (amount > 0) 
	        {
	            balance += amount;
	            System.out.println("Deposit successful. Current balance: " + balance);
	        } 
	        else 
	        {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) 
	    {
	        if (amount > 0 && amount <= balance) 
	        {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Current balance: " + balance);
	        }
	        else
	        {
	            System.out.println("Insufficient funds or invalid withdrawal amount.");
	        }
	    }
	}

		class ATM {
	    private BankAccount bankAccount;
	    private Scanner scanner;

	    	public ATM(BankAccount bankAccount) 
	    	{
	    		this.bankAccount = bankAccount;
	    		this.scanner = new Scanner(System.in);
	    	}

	    public void displayMenu() 
	    {
	        System.out.println("Welcome to the CANARA BANK ATM");
	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        System.out.println("4. Exit");
	    }

	    public void start() 
	    {
	        int choice;
	        do {
	            displayMenu();
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            
	            switch (choice) 
	            {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    deposit();
	                    break;
	                case 3:
	                    withdraw();
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM.");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	            
	        } while (choice != 4);
	    }

	    private void checkBalance() 
	    {
	        System.out.println("Your current balance is: " + bankAccount.getBalance());
	    }

	    private void deposit() 
	    {
	        System.out.print("Enter deposit amount: ");
	        double amount = scanner.nextDouble();
	        bankAccount.deposit(amount);
	    }

	    private void withdraw() 
	    {
	        System.out.print("Enter withdrawal amount: ");
	        double amount = scanner.nextDouble();
	        bankAccount.withdraw(amount);
	    }
	}

	public class ATMinterface 
		{
			public static void main(String[] args) 
			{
				BankAccount bankAccount = new BankAccount(1000); 
				ATM atm = new ATM(bankAccount);
				atm.start();
			}
		
		}