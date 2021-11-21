/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
    
             Scanner scan = new Scanner(System.in);
             int n = scan.nextInt();
             printPattern4(n);
             
     }
     static void printPattern4(int n)
	{
	     for(int i = 1;i<=n;i++)
	     {
	         int spacs = n-i;
	       for(int j =1;j<=i;j++)
	        {
	             System.out.print(j);
	        }
	        for(int k =1;k<=spacs;k++) System.out.print(" ");
	       
	     System.out.println();
	          
	     }
	}
    
	
}
