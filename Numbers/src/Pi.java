import java.util.Scanner;


public class Pi {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of digits of pi to print:");
		int digits = Integer.parseInt(input.nextLine());
		input.close();
		
		System.out.printf("pi to %d digits is %." + digits + "f%n", digits, 16 * Math.atan(0.2) - 4 * Math.atan((float) 1 / (float) 239));
	}

}
