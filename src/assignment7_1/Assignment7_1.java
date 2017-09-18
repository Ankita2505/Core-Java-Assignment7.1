package assignment7_1;
/*
 * program to convert an Integer variable to String using an inbuilt function of String class
 */
import java.util.Scanner; // Importing Scanner Class
public class Assignment7_1 
{
	public static void main(String[] args) // Start of Main Class
	{
		// TODO Auto-generated method stub
		int i; 
		Scanner sc=new Scanner(System.in); //Creating object of Scanner Class		
		System.out.println("Please enter Integer Variable To Covert into String Variable---");
		i=sc.nextInt();
		String s=String.valueOf(i); // String.valueOf() method converts integer to String
		System.out.println("Int Variable converted to String Variable is := " + s );
        sc.close();
	}// Close of Main Class
}
