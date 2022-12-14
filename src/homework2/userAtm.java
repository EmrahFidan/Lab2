package homework2;

import java.util.Scanner;

public class userAtm {

	public static void main(String[] args) {
		// created a series and paid them all a balance
		int[] balance = new int[10];
		for(int i=0;i<10;i++) {
			balance[i]=100;
		}
		// switch between menus
		int id = exit(balance);
		control(id,balance);

	}
	// incorrect inputs
	public static void control(int id,int balance[]) {
		
		if(id>=0 && id<10) {
			
			mainMenu(balance,id);
		}
		else{
			System.out.println("User not found !!! Please enter between 0-9");
			exit(balance);
		}
		
	}

	// switch between main menu and user input screen
	public static void mainMenu(int balance[],int id){

		Scanner value = new Scanner(System.in);
		System.out.println("\nMain Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\n");
		System.out.print("enter a choice: ");
		int choice = value.nextInt();

		if(choice == 1) {
			checkBalance(balance,id);
			mainMenu(balance,id);
		}
		else if(choice == 2) {
			withdraw(balance, id);
			mainMenu(balance,id);
		}
		else if(choice == 3) {
			deposit(balance, id);
			mainMenu(balance,id);
		}
		else if(choice == 4) {
			exit(balance);
			mainMenu(balance,id);
		}
		else {
			System.out.println("invalid choice");
			mainMenu(balance,id);
		}

	}
	// choises
	public static void checkBalance(int balance[], int id) {

		System.out.println("\nThe balance is: " + balance[id]);

	}

	public static void withdraw(int balance[], int id) {

		Scanner value = new Scanner(System.in);
		System.out.print("\nEnter an amount to withdraw:");
		int takeBalance = value.nextInt();

		balance[id] = balance[id] - takeBalance;
		// lack of balance
		if (balance[id] < 0) {
			balance[id] = balance[id] + takeBalance;
			System.out.print("Your balance is " + balance[id]
					+ "\nWithdraw amount is too large.\nYou are redirected to deposit menu\n");
			deposit(balance, id);
		}
		
	}

	public static void deposit(int balance[], int id) {

		System.out.print("\nEnter an amount to deposit:");
		Scanner value = new Scanner(System.in);
		int deposit = value.nextInt();

		balance[id] = balance[id] + deposit;

	}

	public static int exit(int balance[]) {

		Scanner value = new Scanner(System.in);
		System.out.print("enter a id: ");
		int id = value.nextInt();
		control(id,balance);

		return id;
	}

}
