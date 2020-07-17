
import java.util.*;

//********************************************************************
//Garrett McCue 	
//
//7/16/20
//
//CPSC-501-Lab2Ex3
//********************************************************************

public class UserNames {
	// ---------------------------------------------------------------
	// Takes input for first and last name then outputs string mutation
	// of each as well as a variable in the range of 10-99
	// ---------------------------------------------------------------

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random gen = new Random();

		String firstname, lastname, mut_lastname;
		char mut_firstname;

		int num = 10 + gen.nextInt(89);

		System.out.print("Enter your first name: ");
		firstname = scan.nextLine();

		System.out.print("Enter your last name: ");
		lastname = scan.nextLine();

		// assigning 1st character of firstname to mut_firstname
		mut_firstname = firstname.charAt(0);

		// getting first four letters of the lastname
		mut_lastname = lastname.substring(0, 4);

		System.out.println(mut_lastname + " " + mut_firstname + " " + num);

	}

}
