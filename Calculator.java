import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// First, I need to create a new scanner to collect all the user's input
		Scanner input = new Scanner(System.in);

		// Now I will ask them to enter the operation they wish to do
		System.out.println("Welcome to My Calculator! Please enter your operation:\n" +
							" 1) Add\n" +
							" 2) Subtract");
		
		// Then I will get the option they select. It will either be 1 or 2 for now, 
		//     but you will add more options.
		String operation = input.nextLine();

		// If the user chooses 1, then I ask for two numbers and return the sum of the two.
		if(operation.equals("1")) {
			System.out.println("Now I need two numbers. Please enter one number.");
			double num1 = input.nextDouble();
			System.out.println("Please enter another number.");
			double num2 = input.nextDouble();
			
			// I use the add method to add the two numbers together.
			double ans = add(num1, num2);
			System.out.println(num1 + " + " + num2 + " = " + ans);
		}
		else if(operation.equals("2")) {
			System.out.println("Now I need two numbers. Please enter one number.");
			double num1 = input.nextDouble();
			System.out.println("Please enter another number.");
			double num2 = input.nextDouble();
			
			// I use the subtract method to subtract the second number from the first.
			double ans = subtract(num1, num2);
			System.out.println(num1 + " - " + num2 + " = " + ans);
		}
		else {
			System.out.println("Sorry, you entered incorrect input.");
		}
		
		
		
		input.close();
	}
	
	// This method adds two numbers together. It needs to know what two numbers to add together
	//     which is why it has two parameters - number1 and number2.
	public static double add(double number1, double number2) {
		double answer = number1 + number2;
		return answer;
	}
	
	// This method subtracts the second number from the first number. It needs to know the two
	//     numbers to be able to perform the operation which is why it has two parameters - number1
	//     and number 2.
	public static double subtract(double number1, double number2) {
		double answer = number1 - number2;
		return answer;
	}
}
