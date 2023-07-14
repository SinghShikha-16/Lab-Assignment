//Accept age and check eligible for voting or not
package assignment;
public class voting {
	 public static void main(String[] args) {
			    int age = 20; 
			    // If the age is 18 or above, the user is eligible to vote
			    if (age >= 18) {
			        System.out.println("You are eligible to vote.");
			    // If the age is below 18, the user is not eligible to vote
			    } else {
			        System.out.println("You are not eligible to vote yet.");
			    }
			}
}
