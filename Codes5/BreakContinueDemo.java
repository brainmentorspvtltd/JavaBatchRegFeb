import java.util.Scanner;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.in - It is used to take input from the User
		// System is a predefine class and in is a predefine Object
		// in is an object of InputStream
		// Scanner is a buffer, which take System.in value and put
		// in a buffer
		Scanner scanner = new Scanner(System.in);
		// Menu Driven Application
		while(true){
			System.out.println("1. Burger");
			System.out.println("2. Soft Drink");
			System.out.println("3. IceCream");
			System.out.println("4. Ask Again...");
			System.out.println("5. To Quit");
			System.out.println("Enter the Choice");
			int choice = scanner.nextInt();
			if(choice == 1){
				System.out.println("U Order Burger and Price is 99");
			}
			else
			if(choice == 2){	
				System.out.println("U Order Soft Drink and Price is 50");
			}
			else
			if(choice == 4){	
				continue; // i will skip the current iteration and move to the next iteration
			}
			else
			if(choice == 5)
			{
				break; // break will exit from the current loop
			}
//			switch(choice){
//			case 1:
//				System.out.println("U Order Burger and Price is 99");
//				break;
//			case 2:
//				System.out.println("U Order Soft Drink and Price is 50");
//				break;
//			}
		}

	}

}
