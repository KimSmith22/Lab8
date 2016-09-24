import java.util.Scanner;

public class BaseballAveragesv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables

		int atBat;
		int batters;

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
		for (int i = 0; i <= players.length-1; i++) {//row loop
			for (int j = 0; j <= players.length-1; j++) {//column loop
			sum = sum+1;
				System.out.println("Enter player  " + (i + 1) + " at bat " + (j+1) + " :  ");
				atBat = k.nextInt();

			}//end column loop
		}//end row loop

	}// psvm

}// end class
