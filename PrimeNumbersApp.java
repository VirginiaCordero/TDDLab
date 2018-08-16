package cameronandvirginia;

import java.util.Scanner;

public class PrimeNumbersApp {		
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			int n;
			String wantsToContinue = "y";
			
			System.out.println("Let's locate some primes!");
			System.out.println("This application will find you any prime, in order, from first prime number on."
					+ "Which prime number are you looking for?");
			
			do {
//				System.out.println("Let's locate some primes!");
				System.out.println("Which prime number are you looking for?");
				n = scan.nextInt();
				System.out.println("The number " + n + " prime is " + PrimeNumberMethod.getNthPrime(n) + ".");
				System.out.println("Do you want to find another prime number? (y/n)");
				wantsToContinue = scan.next();
				
//				if (!wantsToContinueAnswer.equals("y")) {				
//					wantsToContinue = false;
//				}
			} while (wantsToContinue.equalsIgnoreCase("y"));
			System.out.println("Thanks for playing.");
		}
//		System.out.println("Goodbye");
		

}


