package hr.analemma.ericsson.forrest;

//********************************************************************
//RationalNumber.java       Author: Lewis/Loftus
//
//Represents one rational number with a numerator and denominator.
//********************************************************************

public class RationalNumber2 {
	private int numerator, denominator;

	// -----------------------------------------------------------------
	// Constructor: Sets up the rational number by ensuring a nonzero
	// denominator and making only the numerator signed.
	// -----------------------------------------------------------------
	public RationalNumber2(int numer, int denom) {

		numerator = numer;
		denominator = denom;

	}

	// -----------------------------------------------------------------
	// Returns the numerator of this rational number.
	// -----------------------------------------------------------------
	public int getNumerator() {
		return numerator;
	}

	// -----------------------------------------------------------------
	// Returns the denominator of this rational number.
	// -----------------------------------------------------------------
	public int getDenominator() {
		return denominator;
	}
}
