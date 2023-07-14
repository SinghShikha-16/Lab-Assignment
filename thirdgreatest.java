//Accept 3 no from the user and find out the greatest

package assignment;
public class thirdgreatest {
	public static void main(String[] args) {
	    int number1 = 10;
	    int number2 = 5;
	    int number3 = 8;

	    // Assume the first number is the greatest initially
	    int greatest = number1;

	    // check 'greatest' if 'number2' is greater
	    if (number2 > greatest) {
	        greatest = number2;
	    }

	    // check 'greatest' if 'number3' is greater
	    if (number3 > greatest) {
	        greatest = number3;
	    }

	    System.out.println("The greatest number is: " + greatest);
	}
}
