import java.util.Scanner;

public class TheDiceGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		TheDice myDice = new TheDice();
		String userChoice = "yes";
		int choiceOfDice;
		int systemDice;
		
		System.out.println("Dice game. Computer will throw a dice");
		System.out.println("You have to guess what the number on that dice is");
	
	while (userChoice.equals("yes")){
			
			System.out.println("Lets start: how many dices do you want to play with (1, 2 or 3) ?");
			choiceOfDice = scan.nextInt();
	
			if(choiceOfDice == 1){
				
				myDice.dice1();
				System.out.println("Lets start: Guess a Number from 1-6 ");
				int numberGuessed = scan.nextInt();
					
					if( systemDice == numberGuessed){
						System.out.println("You are correct. Good Job");
						
					}else if(systemDice > numberGuessed){
						System.out.println("Your number is to high");
						
						
					}else{
						System.out.println("Your number is to low");
						
					}
				
			}else if(choiceOfDice == 2){
				
				myDice.dice2();
				System.out.println("Lets start: Guess a Number from 1-12 ");
				int numberGuessed = scan.nextInt();
				
					if(systemDice == numberGuessed){
						System.out.println("You are correct. Good Job");
						
					}else if(systemDice > numberGuessed){
						System.out.println(" Your number is to high");
						
					}else{
						System.out.println("Your number is to low");
						
					}
				
			}else{
				
				myDice.dice3();
				System.out.println("Lets start: Guess a Number from 1-18 ");
				int numberGuessed = scan.nextInt();
				
					if( systemDice == numberGuessed){
						System.out.println("You are correct. Good Job");
						
					}else if( systemDice > numberGuessed){
						System.out.println("Your number is to high");
						
					}else{
						System.out.println(" Your number is to low");
						
					}
				
			}
			System.out.println("Do you want to play again");
			userChoice = scan.next();
			
		}
	
	}
}
