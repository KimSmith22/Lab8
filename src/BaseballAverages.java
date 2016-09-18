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
		while(atBat > 4){//boolean statement to initiate loop & validation statement
			System.out.println("Please enter a number between 0 and 4");
			atBat = k.nextInt();
		}//end loop
		System.out.println();
		
		//scoring legend
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
		System.out.println();
		
		//code to print array data to console
		int[] base = {0, 1, 0, 2, 3};
		for(int i = 0; i < base.length; i++){
			/*tried a bunch of different variables in the following line
			 * in an attempt to see which variable would get the output
			 * to increment; while i+1 works i am not getting expected result
			 */
			System.out.println("Result for at-bat " +(i+1) + ":  " + base[i]);
		}
			
		/*call methods to invoke output
		BaseballMethods.getBatAvg(atBat, scoredAtBat, base, batav);
		BaseballMethods.getSlug(atBat, base, slug);
		*/
			
		}//psvm

	}// end class


