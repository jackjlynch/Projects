import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberToPrint;
		int currentNumber = 1;
		int lastNumber = 0;
		
		System.out.print("Enter the number of numbers in the Fibonacci sequence to print (or n):");
		String number = input.nextLine();
		input.close();
		
		if(number.equals("n")) {
			while(lastNumber < Integer.MAX_VALUE) {
				System.out.println(currentNumber);
				currentNumber += lastNumber;
				lastNumber = currentNumber - lastNumber;
			}
		}
		else {
			numberToPrint = Integer.parseInt(number);
			for(int i = 0; i < numberToPrint; i++) {
				System.out.println(currentNumber);
				currentNumber += lastNumber;
				lastNumber = currentNumber - lastNumber;
			}
		}
		
	}

}
