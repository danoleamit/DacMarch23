package org.lab.prg.copy2;

import java.util.Scanner;

public class Count_Words {
	
	  static int wordcount(String string)  
	        {  
	          int count=0;  
	          char ch[]= new char[string.length()];
	          
	            for(int i=0;i<string.length();i++)  
	            {  
	            	
	                ch[i]= string.charAt(i);  
	                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
	                    count++;  
	            }  
	            return count;  
	        } 
	  
	  
	      static Scanner sc = new Scanner(System.in);
	      public static void main(String[] args)
	      {  
	    	  System.out.println("Write the sentence: ");
	          String string = sc.nextLine();  
	         System.out.println(wordcount(string) + " words.");   
	    }  
	}  


