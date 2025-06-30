package HomeAssignments;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 1221;       // You can change this value to test other numbers
        int original = input;    // Store the original number
        int output = 0;          // To store the reversed number

        // Reverse the digits of the number
        while (input != 0) {
            int digit = input % 10;
            output = output * 10 + digit;
            input = input / 10;
        }

        // Check if original and reversed are the same
        if (original == output) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}
