
import java.util.Scanner;

public class OddEvenGame {
	
	public static void main(String [] args){
	
		Scanner scan = new Scanner(System.in);
		
		int userWins= 0;
		int computerWins = 0;
		int computerNum;
		String userAnswer;
		String keepPlaying;
		String computerOddEven;
		
		System.out.println("This is a guess if the number is odd or even game !");
		
		do{
		computerNum = 0 + (int) ( Math.random() * 10 );

		if(computerNum % 2 == 0){
			computerOddEven = ("even");
			
			System.out.println("The computer has a number is it even or odd? ");
			userAnswer = scan.next(); 
			
			
			if (userAnswer.equals(computerOddEven)){
				
				System.out.println("You guessed Correctly");
				userWins++;
				
				System.out.println("Do you want to keep playing ?");
				keepPlaying = scan.next();
				
			} else{
				
				System.out.println("You guessed Wrong");
				computerWins++;
				
				System.out.println("Do you want to keep playing ?");
				keepPlaying = scan.next();
			}
		}else{
			computerOddEven = ("odd");
			
			System.out.println("The computer has a number is it even or odd? ");
			userAnswer = scan.next(); 
			
			
			if (userAnswer.equals(computerOddEven)){
				
				System.out.println("You guessed Correctly");
				userWins++;
				
				System.out.println("Do you want to keep playing ?");
				keepPlaying = scan.next();
			} else{
				
				System.out.println("You guessed Wrong");
				computerWins++;
				
				System.out.println("Do you want to keep playing ?");
				keepPlaying = scan.next();
			}
		}
		
		
		} while(keepPlaying.equals("yes"));
		
		if ( keepPlaying.equals("no") ){
			System.out.println("you won " + userWins + " Game/s");
			System.out.println("The computer won " + computerWins + " Game/s");
		
			if (userWins > computerWins){
				System.out.println("You won more games ! congradulations you are the Winner");
				}else if(userWins == computerWins){
					System.out.println("Equal amount of games wons. Its a tie");	
				}else{
					System.out.println("The computer won more games and is the Winner ! YOU SUCK");
				}
		}
		
	}
}
	
