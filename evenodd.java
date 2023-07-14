//WAP to accept a no from the user and check it is even or odd
package assignment;

public class evenodd {
	public static void main(String[] args) {
	    int number = 20;

	    // Checking if the number is divisible by 2
	    String status;

	    if (number % 2 == 0) {
	        status = " is Even";
	    } else {
	        status = " is Odd";
	    }

	    System.out.println(number + status);
	}
}
