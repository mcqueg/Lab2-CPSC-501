import java.util.*;

//********************************************************************
//Garrett McCue 	
//
//7/16/20
//
//CPSC-501-Lab2Ex4
//********************************************************************

public class AgeGuessEx4 {

	// ---------------------------------------------------------------
	// A modified version of AgeGuess but implementing conditional
	// statements in order to give more feedback to the user.
	// ----------------------------------------------------------------

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random gen = new Random();

		String name;
		int ageGuess;
		int age = gen.nextInt(100);

		System.out.print("Enter name: ");
		name = scan.nextLine();

		System.out.print("Enter age guess: ");
		ageGuess = scan.nextInt();

		System.out.println("name: " + name);
		System.out.println("age guess: " + ageGuess);
		System.out.println("actual age: " + age);

		if (age != ageGuess) {
			System.out.println("You guessed wrong!");

			if (ageGuess < age)
				System.out.println("older");
			else
				System.out.println("younger");

		}

	}

}
