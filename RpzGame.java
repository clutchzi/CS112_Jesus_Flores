import java.util.Scanner;


public class RpzGame {
	
	public static void main(String [] args){
		
		String computerChoice = null;
		int min = 0;
		String choice;
		Scanner scan = new Scanner(System.in);
		
		min = min + (int)(Math.random() * ((3 - 1) + 1));
		
		 System.out.println("Lets play rock paper scizzors. choose one ");
		 choice = scan.nextLine();
		 
		 if(min == 0){
			  computerChoice = ("rock");
			  
			  if(computerChoice == choice){ 
				  System.out.println("It is a draw");
			  }else if ( choice.equals("paper")  ){
				  System.out.println("Paper beats rock ! you won !");
			  }else if ( choice.equals("scizzors")  ){
				  System.out.println("Scizzors loses to rock ! you lost !");
				   }
		

		 }else if(min == 1){
			  computerChoice = ("paper");
			  
			  if(computerChoice == choice){ 
				  System.out.println("It is a draw");
			  }else if ( choice.equals("rock")  ){
				  System.out.println("Paper beats rock ! you won !");
			  }else if ( choice.equals("scizzors")  ){
				  System.out.println("Scizzors beats paper ! you lost !");
				   }
			 
		 }else if (min == 2){
			 computerChoice = ("scizzors");
			 
			  if(computerChoice == choice){ 
				  System.out.println("It is a draw");
			  }else if ( choice.equals("paper")  ){
				  System.out.println("Paper loses to scizzors you lose !");
			  }else if ( choice.equals("rock")  ){
				  System.out.println("Rock beats scizzors you win !");
			  }
		 }

		 
		 
	}
}
