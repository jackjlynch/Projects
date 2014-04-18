import java.util.Scanner;


public class NextPrime {

	public static void main(String[] args) {
		boolean[] primes = new boolean[100000]; //ugly, just designed to make a big array that fits into memory
		
		//false means prime
		primes[0] = true; //will not be used--essentially ignoring offset and letting index = the actual number
		primes[1] = true; //1 is not prime
		
		for(int i = 2; i < primes.length; i++){
			if(!primes[i])
				for(int j = 2; i * j < primes.length; j++)
					primes[i * j] = true;
				
		}
		
	int i = 0;
	Scanner input = new Scanner(System.in);
	
	do {
		while(primes[i])
			i++;
		System.out.println(i++);
		System.out.print("Print another prime? (y/n)");
	} while(input.nextLine().contains("y"));
	
	input.close();

	}
}
