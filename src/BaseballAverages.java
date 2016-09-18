import java.util.Scanner;

/**
 * @author Kimberli
 *
 */
public class BaseballAverages {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// variables
		int scoredAtBat= 0;
		int base = 0;
		int slug = 0;
		int batav = 0;
		
		
		//sysout
		System.out.println("Batting Average Calculator");
		System.out.println();
	
		//prompt for user input
		System.out.println("Enter number of times at bat:  ");
		Scanner k = new Scanner(System.in);
		
			//array of unknown length
		int atBat = Integer.parseInt(k.nextLine());
		int[] times = new int[atBat];
		while(atBat > 4){
			System.out.println("Please enter a number between 0 and 4");
			atBat = k.nextInt();
		}
		System.out.println();
		
		//scoring legend
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
	
		//call methods to invoke output
		BaseballMethods.getBatAvg(atBat, scoredAtBat, base, batav);
		BaseballMethods.getSlug(atBat, base, slug);
		
		}//psvm

	}// end class


