
public class TheDice {
	
	public void dice1( int systemDice){
		systemDice = 1 + (int)(Math.random() * 6); 

	}
	public void dice2(int systemDice){
		systemDice = 1 + (int)(Math.random() * 6); 
		systemDice = systemDice * 2;
	}
	public void dice3(int systemDice){
		systemDice = 1 + (int)(Math.random() * 6); 
		systemDice = systemDice * 3;
	}
}
