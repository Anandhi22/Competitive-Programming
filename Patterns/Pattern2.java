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
             printPattern2(n);
             
     }
     static void printPattern2(int n)
	{
	     for(int i = 1;i<=n;i++)
	     {
	          int spacs = i-1;
	       for(int k =1;k<=spacs;k++) System.out.print(" ");
	        for(int j =i;j<=n;j++)
	        {
	             System.out.print("*");
	        }
	     System.out.println();
	          
	     }
	}
	
}