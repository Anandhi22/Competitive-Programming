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
             printPattern6(n);
             
     }
     static void printPattern6(int n)
	{
	     for(int i = 1;i<=n; i++)
	     {
	         int spacs = Math.abs(n-i);
	         for(int k =1;k<=spacs;k++) System.out.print(" ");
	        // int totalCol = (i>n)? 2*n - i: i;
	       for(int j =1;j<=i;j++)
	        {
	             System.out.print("*");
	        }
	        
	       
	       System.out.println();
	          
	     }
	     
	}
	
}
