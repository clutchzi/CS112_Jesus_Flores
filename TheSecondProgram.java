import java.util.Scanner;

public class TheSecondProgram {
	
	public static void main(String [] args){
		
		int N;
		int M = 1;
		int F = 1;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Give me a number");
		N = scan.nextInt();

		do{
			F = F * M;
			
			if (M == N){
				System.out.print(F);
			}else{
				M = M + 1;
			}
		}while (M != N);
			
		
			
		
		
	}
}
