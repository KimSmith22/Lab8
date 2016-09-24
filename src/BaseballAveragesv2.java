import java.util.Scanner;

public class BaseballAveragesv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables

		int atBat;
		int batters;
		int hits = 0;
		int i;
		int j;

		// sysout & scanner
		System.out.println("Batting Average Calculator");
		System.out.println();

		Scanner k = new Scanner(System.in);// opens scanner

		System.out.println("Enter number of batters:  ");
		batters = k.nextInt();

		System.out.println("Enter number of times at bat:  ");
		atBat = k.nextInt();

		int[][] players = new int[batters][atBat];
		while (atBat < 1) {// validation and loop
			System.out.println("Please enter a positive number");
			atBat = k.nextInt();
		} // end validation loop
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
		System.out.println();

		double sum = 0.000;
		int x = 0;
		int y = 0;
		for (i = 0; i <= players.length - 1; i++) {// row loop
			for (j = 0; j <= players.length - 1; j++) {// column loop
				sum = y + 1;
				if (j > -1) {
					hits = x + 1;
				} // end loop to count hits
				System.out.println("Enter player  " + (i + 1) + " at bat " + (j + 1) + " :  ");
				atBat = k.nextInt();

			} // end column loop
		} // end row loop

		System.out.println("Player " + (i - 1) + " Batting average:  " + hits / atBat
				+ "                                             Slugging Percentage:  " + sum / atBat);
	}// psvm

}// end class
