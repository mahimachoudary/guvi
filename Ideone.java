/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    int c;
    System.out.println("Input an integer");
    Scanner in = new Scanner(System.in);
    c = in.nextInt();
 
    if ( (c/2)*2 == c )
      System.out.println("Even");
    else
      System.out.println("Odd");

		// your code goes here
	}
}
