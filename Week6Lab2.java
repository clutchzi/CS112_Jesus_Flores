
import java.util.Scanner;

public class Week6Lab2 {


	public static void main(String [] args){
			
			Scanner scan = new Scanner(System.in);
			int numberGuessed;
			boolean Muahaha;
			int computerNum = 0 + (int) ( Math.random() * 10 );
			int lots;
			
		
			lots = 1;
			Muahaha = true;
			
			while (Muahaha) {
				
				System.out.println("Guess a nmuber from 1 to 10 ");
				numberGuessed = scan.nextInt(); 
			
				if(numberGuessed == computerNum){
				System.out.println("Good Job you guessed right");
				} else if(numberGuessed > computerNum ){
				System.out.println("Your number is to big");
				} else if(numberGuessed < computerNum ){
					System.out.println("Your number is to small");	
				}
		
				lots++;
				Muahaha = lots <4;
			
			} 
		
	}
}

