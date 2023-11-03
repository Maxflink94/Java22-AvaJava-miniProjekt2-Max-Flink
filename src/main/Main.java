package main;

import recursivePrime.RecursivePrime;

public class Main {

	public static void main(String[] args) {
		RecursivePrime rp = new RecursivePrime();
		rp.showPrimes(RecursivePrime.getStart(), RecursivePrime.getEnd());
	}
}
