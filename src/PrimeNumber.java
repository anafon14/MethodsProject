 import java.util.Scanner; 
 
 /**
  * Name: Ana Luiza Fonseca Teixeira
  * Teacher: Mr. Hardman 
  * Assignment 6, Program #3
  * Date Last Modified: 12/12/2016
  */
 
/**
 * @author a.fonsecateixei
 *
 */
 
public class PrimeNumber {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int userNumber;
		boolean prime;
		
		System.out.println("Please, enter an integer: ");
		userNumber = userInput.nextInt();
		
		if(userNumber == 1){
			
			System.out.println("The number is prime!");
			
		}
		
		else{
			
			prime = isPrime(userNumber);
			
			if(prime == true){
				
				System.out.println(userNumber + " is a prime number!");
				
			}
			
			else{
				
				System.out.println(userNumber + " is not a prime number!");
				
			}
			
		}
	
		userInput.close();

	}
	
	/**
	 * isPrime checks if the given number is a prime number or not
	 * 
	 * @param userNumber is the number that gets checked if it is prime or not
	 * @return if the given number is prime or not
	 */
	
	public static boolean isPrime(int userNumber){
		
		boolean prime = true;
		
		for(int i = 2; prime && i <= Math.sqrt(userNumber); i++){
			
			if ( userNumber % i == 0){
				prime = false;
			
			}
			
		}
		
		return prime;

	}

}
