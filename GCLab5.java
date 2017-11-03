import java.util.Scanner;/**
 * 
 */

/**
 * @author hbm1
 *
 */
public class GCLab5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Grand Circus Casino!");
		
				
		//get user input for sides of dice
				
		String answer = "y";
		int dieSides = 0;
		int rolls = 2;
		int rollNum = 0;
//		String answer = " ";
		
		while ((answer.equalsIgnoreCase("y"))) { 
			
			System.out.println("How many sides should each die have?");
			Scanner scan = new Scanner(System.in);
			dieSides = scan.nextInt();
			
			int roll1 = (int) (Math.random() * dieSides) +1;
				
			
				System.out.println(roll1);
				System.out.println("Do you want to roll again?");
				Scanner scnr = new Scanner (System.in);
				answer = Validator.getString(scnr, " ");
				
				
				
			}

			
			System.out.println("Goodbye");
			//			int [] dieArray = new int [rolls];
			
			
		}
		 
		
		
		
		
		
//			scan.close();
	}


