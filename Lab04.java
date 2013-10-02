

import java.util.Scanner;

public class Lab04 {

	public static void main(String [] args){
			
			Scanner scan = new Scanner(System.in);
			int numberGuessed;
			boolean Muahaha;
			int computerNum = 0 + (int) ( Math.random() * 10 );
			String keepPlaying;
		
			Muahaha = true;
			
			while (Muahaha) {
				
				
				System.out.println("Guess a number from 1 to 10 ");
				numberGuessed = scan.nextInt(); 
			
				if(numberGuessed == computerNum){
				System.out.println("Good Job you guessed right");
				} else if(numberGuessed > computerNum ){
				System.out.println("Your number is to big");
				} else if(numberGuessed < computerNum ){
					System.out.println("Your number is to small");	
				}
					System.out.println("Do you want to keep playing yes, or no ? ");
					keepPlaying = scan.next();
					
				Muahaha = keepPlaying.equals("yes");		
			
			} 
	}
}


