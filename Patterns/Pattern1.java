

import java.util.*;
import java.lang.*;
import java.io.*;

class Pattern
{
	public static void main (String[] args) 
	{
    
             Scanner scan = new Scanner(System.in);
             int n = scan.nextInt();
             printPattern1(n);
             
        
	}
	
	static void printPattern1(int n)
	{
	     for(int i = 1;i<=n;i++)
	     {
	        for(int j =1;j<=i;j++)
	        {
	             System.out.print("*");
	        }
	     System.out.println();
	          
	     }
	}
}