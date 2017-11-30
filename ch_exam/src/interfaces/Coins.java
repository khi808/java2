package interfaces;

interface IterA {
	public static final int PENNY = 1, NICKEL=5,DIME=10,QUARTER=25;
}

public class Coins{
	public static void main(String[] args) {
		System.out.println("Dime은"+IterA.DIME);
	}
}