import java.text.DecimalFormat;
import java.util.Scanner;


//********************************************************************
//Garrett McCue 	
//
//7/16/20
//
//CPSC-501-Lab2Ex2
//********************************************************************

public class DistCalc {
	
	//--------------------------------------------------
	//
	// Calculates the distance between two pairs of 
	// points, (x1,y1) and (x2,y2).
	//
	//---------------------------------------------------

	public static void main(String[] args) {

		int x1, y1, x2, y2;

		double a, b, c, dist;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter x1: ");
		x1 = scan.nextInt();

		System.out.print("Enter y1: ");
		y1 = scan.nextInt();

		System.out.print("Enter x2: ");
		x2 = scan.nextInt();

		System.out.print("Enter y2: ");
		y2 = scan.nextInt();

		//gets inner calculations of distance formula based on input
		a = x2 - x1;
		b = y2 - y1;

		// calculates everything under the square root
		c = Math.pow(a, 2) + Math.pow(b, 2);

		dist = Math.sqrt(c);

		// formats decimal to three decimal places
		DecimalFormat fmt = new DecimalFormat("0.###");

		System.out.println("The distance between (x1,y1) and " + "(x2,y2) is: " 
				+ fmt.format(dist));

	}

}
