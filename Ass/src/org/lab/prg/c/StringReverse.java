package org.lab.prg.c;

import java.io.*;
import java.util.Scanner;

class Strings {
   public void  Rever_Strin(String str1)
	     { 
	    	 String Reverse_str="";
		     char c;
	    	 for (int i=0; i<str1.length(); i++)
		      {
	    		 if(str1.charAt(i)>='A' && str1.charAt(i)<='Z' || str1.charAt(i)>='a' && str1.charAt(i)<='z'  )
	    		 {
	    			 c=str1.charAt(i);                       
	 		         Reverse_str= c+Reverse_str;             
	 		      }	    		 
	    		 else
	    		 {
	    			 System.out.println("Invalid input");
	    			 return ;
	    		 }    		             
		      }
	    	 System.out.printf("\nOriginal word: "+str1+"\n\n");
		     System.out.println("Reversed word: "+ Reverse_str);      
	     }
	     
	     public String AcceptString()
	     {	    	 
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.printf("Enter your word= ");
	    	 String str1 = sc.nextLine();
	    	 return str1;
	     }
}
public class StringReverse{

      public static void main( String[] args)
{           
    	    Strings s = new Strings();
	        String str1= s.AcceptString();
	        s.Rever_Strin(str1);
	       
}
}