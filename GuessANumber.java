import java.util.Scanner;


public class GuessANumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numberGuessed;
		
		int computerNum = 0 + (int) ( Math.random() * 10 );
		
		int count = 1;
		while (count < 4) {
			
			System.out.println("Guess a number from 1 to 10 ");
			numberGuessed = scan.nextInt(); 
			
			if(numberGuessed == computerNum ){
				System.out.println("Good Job you guessed right");
			}
			if (numberGuessed > computerNum ){
				System.out.println("Your number is to big");
			}
			if (numberGuessed < computerNum ){
				System.out.println("Your number is to small");
			} count++;
		
		}
	}
	
}
