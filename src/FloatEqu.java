//********************************************************************
//Garrett McCue 	
//
//7/16/20
//
//CPSC-501-Lab2Ex5
//********************************************************************
public class FloatEqu {

	public static void main(String[] args) {
		
		double var1 = (1.0/10) * (1.0/10);
		double var2 = (1.0/100);
		final double TOLERANCE = 0.000001;
		
		// PART A...
		if (var1 == var2)
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
		// I am not surprised at the outcome because the "==" operator
		// should rarely be used to compare floats or doubles
		
		
		// PART B...
		// the preferred method to determine if floats/doubles are
		// approximately equal.
		
		if (Math.abs(var1 - var2) < TOLERANCE)
			System.out.println ("Essentially equal");
	}

}
