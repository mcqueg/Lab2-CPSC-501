import java.util.*;

//********************************************************************
//Garrett McCue 	
//
//7/16/20
//
//CPSC-501-Lab2Ex1
//********************************************************************

public class AgeGuess {

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

	}

}
