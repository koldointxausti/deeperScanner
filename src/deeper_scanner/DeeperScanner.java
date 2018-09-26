package deeper_scanner;

import java.util.Scanner;

public class DeeperScanner {
	public static void main(String[] args) {
		// next()	-- Only reads one word
			System.out.println("Enter your full name:");
			Scanner scan = new Scanner(System.in);
			// read the first word
			String firstName = scan.next();
			System.out.println("First Name is "+firstName);	
			// read the second word
		// hasNext()	-- to check if there's a next token
			if (scan.hasNext()) {
				String lastName = scan.next();
				System.out.println("Last Name is "+lastName);
			};
			
			
			
				
		// nextLine()	-- Reads the whole line
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a sentence: ");
			String sentence = scanner.nextLine();
			
			System.out.println("This is your sentence: "+sentence);		
			scanner.close();			
	}
}
