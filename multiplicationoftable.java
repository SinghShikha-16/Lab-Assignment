//WAP to accept a no from the user and display the multiplication table (5*1=5)
package assignment;

public class multiplicationoftable {
	public static void main(String[] args) {
	    int num = 5; 
	    int i = 1; 

	    while (i <= 10) {
	        // Prints the table of the entered number
	        System.out.printf("%d * %d = %d \n", num, i, num * i);

	        // Increment the counter variable
	        i++;
	    }
	}

}
