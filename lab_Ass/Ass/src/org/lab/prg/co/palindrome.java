package org.lab.prg.co;

import java.io.*;
import java.util.Scanner;

public class palindrome  {
    public static boolean Check_Palindrome(String str)
    {
        
        String rev = "";
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
        	
        	if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z'  )
        	{
        		rev = rev + str.charAt(i);
        		
        	}
        	else
        	{
        		System.out.println("Invalid input, Please enter valid input");
        		return ans;
        		
        	}
        	
        }
        System.out.println("Word= "+str);
        System.out.println("Reverse word= "+rev);
        
        
        
        if (str.equals(rev)) 
        {                                 // Checking if both the strings are equal
            ans = true;
            System.out.println("The String is Palindrome");
        }
        else
        {
        	System.out.println("The String is non Palindrome");
        }
        return ans;
        
        
        
     }
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the word");
        String str = sc.nextLine();
        boolean A = Check_Palindrome(str);
        
        //System.out.println(A);
    }
}
