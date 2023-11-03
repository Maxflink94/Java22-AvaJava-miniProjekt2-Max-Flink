package recursivePrime;

public class RecursivePrime {

	static int primeCount = 0;
	static int start = 0;
	static int end = 1000;

	/**
	 * Rekursiv metod för att gå igenom alla tal mellan intervallet start och end och se om de är primtal eller ej.
	 * Är talet ett primtal så printas det ut i konsolen.
	 * @param start
	 * @param stop
	 */
	public void showPrimes(int current, int end) {
		// BaseCase
        if (current > end) {
        	printPrimeCount();
            return;
        }
        
        // Printar ut primtalet
        if (isPrime(current)) {
            System.out.println("Primtal: " + current + " | Uträkningen: (" + getCalculation(current) + ")");
            primeCount++;
        }

        // Kollar nästa tal i följd rekursivt
        showPrimes(current + 1, end);
    }

	/**
	 * Metod för att se om ett tal är ett primtal eller ej.
	 * @param num
	 * @return
	 */
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Metod för att skriva ihop uträkningen av primtalet som visas.
     * @param num
     * @return
     */
    public String getCalculation(int num) {
        StringBuilder calculation = new StringBuilder();
        calculation.append("1");
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                calculation.append(" / ").append(i);
            }
        }
        return calculation.toString();
    }
    
    /**
     * Metod för att skriva ut det totala antalet primtal mellan intervallet start och stop.
     */
    public void printPrimeCount() {
    	System.out.println("---------------------------------------------");
        System.out.println("Totala antalet primtal mellan " + start + "-" + end + ": " + primeCount + "st");
    }

    /**
     * Getter för startpunkten i intervallet
     * @return
     */
	public static int getStart() {
		return start;
	}

	/**
	 * Getter för slutpunkten i intervallet
	 * @return
	 */
	public static int getEnd() {
		return end;
	}
    
}
