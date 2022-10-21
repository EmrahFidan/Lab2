package homework2;

import java.util.Scanner;

public class userAtm {

	public static void main(String[] args) {
		// created a series and paid them all a balance
		int[] balance = new int[10];
		for(int i=0;i<10;i++) {
			balance[i]=100;
		}

	}

	public static void mainMenu(int balance[],int id){

		Scanner value = new Scanner(System.in);
		System.out.println("\nMain Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\n");
		System.out.print("enter a choice: ");
		int choice = value.nextInt();

		if(choice == 1) {
			
			mainMenu(balance,id);
		}
		else if(choice == 2) {
			
			mainMenu(balance,id);
		}
		else if(choice == 3) {
			
			mainMenu(balance,id);
		}
		else if(choice == 4) {
			
			mainMenu(balance,id);
		}
		else {
			System.out.println("invalid choice");
			mainMenu(balance,id);
		}

	}

	public static void checkBalance(int balance[], int id) {

		System.out.println("\nThe balance is: " + balance[id]);

	}
}
