import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int attempt=1;
		int userGuessNumber=0;
		int secretNumber=(int)(Math.random()*99+1); 
		Scanner userInput=new Scanner(System.in);
		System.out.println("Welcome to Guess Number Game \n you will be asked to guess a number to win the game \n You have maximum 5 attempts");
		do { 
			System.out.println("Enter a guess number between 1 to 100");
			if(userInput.hasNextInt()) {
				userGuessNumber=userInput.nextInt();
				if(userGuessNumber==secretNumber) {
					System.out.println("your number is correct.You win the game!");
					break;
				}
				else if(userGuessNumber<secretNumber)
					System.out.println("your guess number is smaller");
				else if(userGuessNumber>secretNumber) {
					System.out.println("your guess number is greater");
					if(attempt==5) {
						System.out.println("you exceeded the no.of attempts");
						break;
					}
					attempt++;
				}else {System.out.println("enter a valid integer number");
				break;
				}
				
	}

		}
		while(userGuessNumber!=secretNumber);
		}
	
}

