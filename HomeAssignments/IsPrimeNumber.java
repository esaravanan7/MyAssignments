package HomeAssignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
		boolean isPrime = true;

        // Check if number is less than 2 (not prime)
        if (number < 2) {
            isPrime = false;
        } else {
            // Check Iterate through all numbers from 2 to n-1
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Result
        if (isPrime) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is not a Prime number.");
        }
    }
}
