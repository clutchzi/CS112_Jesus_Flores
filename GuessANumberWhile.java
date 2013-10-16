
import java.util.Scanner;

public class GuessANumberWhile {
	
	public static void main(String [] args){
		
		int gamesPlayed = 0;
		int numberGuessed;
		int computerNum;
		int userWins = 0;
		int computerWins = 0;
		String keepPlaying;
		
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("This is a guess a number game ! ");
		System.out.println("Ready to start ");
	
	
	do{

		keepPlaying = "no";
		

		computerNum = 0 + (int) ( Math.random() * 10 );
		
		System.out.println("So far you have played " + gamesPlayed + " game/s");
		
		System.out.println("Guess a number from 1 to 10");
		numberGuessed = scan.nextInt(); 
	
		if (numberGuessed == computerNum ){
			
			System.out.println("You guessed right ");
			userWins++;
			gamesPlayed++;
			
			System.out.println("do you want to keep playing ? (yes or no)");
			keepPlaying = scan.next();
			
		}else{
			
			System.out.println("You guessed wrong ");
			computerWins++;
			gamesPlayed++;
			System.out.println("do you want to keep playing ? (yes or no)");
			keepPlaying = scan.next();
		}
	} while( keepPlaying.equals("yes") );
	
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