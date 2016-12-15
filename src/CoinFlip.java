 import java.util.Scanner; 
 import java.util.Random;
 
 /**
  * Name: Ana Luiza Fonseca Teixeira
  * Teacher: Mr. Hardman 
  * Assignment 6, Bonus Program 
  * Date Last Modified: 12/14/2016
  */

/**
 * @author a.fonsecateixei
 *
 */
 
public class CoinFlip {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int numFlips;
		int currentFlip;
		
		int numHeads = 0;
		int numTails = 0;
		
		
		System.out.println("How many times do you want me to flip the coin?");
		numFlips = userInput.nextInt();
		
		for(int i = 0; i < numFlips; i++){
			
			currentFlip = coinFlip();
			
			if (currentFlip == 0){
				
				numHeads++;
				
			}
			
			else{
				
				numTails++;
				
			}
			
		}
		
		System.out.println("\n" + "Number of heads and tails: ");
		System.out.println(String.format( "%-10s" + numHeads, "Heads:") );
		System.out.println(String.format( "%-10s" + numTails, "Tails:") );
		System.out.println(String.format( "%-10s" + (numHeads/(numFlips*1.0) * 100), "% Heads:") );
		System.out.println(String.format( "%-10s" + (numTails/(numFlips*1.0) * 100), "% Tails:") );
		
		userInput.close();

	}
	
	/**
	 * coinFlip chooses between heads and tails
	 * 
	 * @param There are no parameters.
	 * @return the pick between heads and tails
	 */
	
	public static int coinFlip(){
		
		int result;
		Random picker = new Random();
		
		result = picker.nextInt(2);
		
		if (result == 0){
			
			System.out.println("Heads!");	
			
		}
		
		else {
			
			System.out.println("Tails!");	
			
		}
		
		return result;
		
	}

}
