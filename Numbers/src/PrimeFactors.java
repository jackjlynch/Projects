import java.util.Scanner;


public class PrimeFactors {
	
	public static void main(String args[]) {
		System.out.println("Enter the number to be factored:");
		
		
		Scanner input = new Scanner(System.in);
		int number = Integer.parseInt(input.nextLine());
		int lastFactor;
		
		while(!isPrime(number)) {
			lastFactor = nextPrimeFactor(number);
			System.out.println(lastFactor);
			number /= lastFactor;
		}
		System.out.println(number);
			
	}
	
	
	public static boolean isPrime(int num) {
		if(num == 2)
			return true;
		if(num % 2 == 0)
			return false;
		for(int i = 3; i * i <= num; i += 2)
			if(num % i == 0)
				return false;
		
		return true;
	}
	
	public static int nextPrimeFactor(int num) {
		if(isPrime(num))
			return num;
		
		for(int i = 2; i < num; i++)
			if(isPrime(i) && num % i == 0)
				return nextPrimeFactor(num / i);
		
		return -1; //error case
	}
	
	


}
