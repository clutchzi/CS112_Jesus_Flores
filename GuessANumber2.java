
import java.util.Scanner;

public class GuessANumber2 {

	public static void main(String [] args){
			
			Scanner scan = new Scanner(System.in);
			int numberGuessed;
			boolean helloThere;
			int computerNum = 0 + (int) ( Math.random() * 10 );
			
			System.out.println("Guess a nmuber from 1 to 10 ");
			numberGuessed = scan.nextInt(); 
			
			helloThere = numberGuessed == computerNum;
			
			
			if(helloThere){
				System.out.println("Good Job you guessed right");
			} else if(numberGuessed > computerNum ){
				System.out.println("Your number is to big");
			} else if(numberGuessed < computerNum ){
				System.out.println("Your number is to small");	
			}
		}
	}

