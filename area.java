//WAP to accept R from the user and calculate AC & CC
package assignment;

public class area {
	 public static void main(String args[])
	  {
		// Declare and assign the radius of the circle
	        int radius = 5;

	        // Calculate the area of the circle
	        double area = Math.PI * (radius * radius);
	        System.out.printf("Area is: %.2f", area);

	        // Calculate the circumference of the circle
	        double circumference = Math.PI * 2 * radius;
	        System.out.printf("\nCircumference is: %.2f", circumference);
	  }
}
