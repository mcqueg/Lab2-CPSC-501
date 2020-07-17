import java.util.Scanner;

//********************************************************************
//Garrett McCue 	
//
//7/16/20
//
//CPSC-501-Lab2Ex5
//********************************************************************

public class NumDisplay {

	//-----------------------------------------------------------------
	// Takes in a number between 0-9 from user and displays the 
	// corresponding word for the number or informs user that the 
	// number they entered was incorrect.
	//-----------------------------------------------------------------
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int usernum;
		
	
	System.out.print("Enter a number between 0 & 9: ");
	usernum = scan.nextInt();
	
	switch (usernum)
	{
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		default:
			System.out.println("You entered a wrong number");
		}
	}
}
