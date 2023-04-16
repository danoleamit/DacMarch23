package org.lab.prg.copy;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

 class Array
{
	
 static Scanner sc = new Scanner(System.in);
 
 static void acceptRecord(int[] arr)    	 {
		try {
	    
		if( arr != null ) 
	      {
	        for( int index = 0; index < arr.length; ++ index ){
	             System.out.print("Enter element no "+index+" = ");
	             arr[ index ] = sc.nextInt();
	           }
	      }
		}catch(InputMismatchException e)
			{
				System.out.println("Please Enter valid input");
			}
 }

  static void printRecord(int[] arr)   {
	System.out.printf("\n\n");
	System.out.printf("Elements of array= ");
    System.out.println( Arrays.toString(arr) );  
 }
  
  static void Sum(int[] arr)  
 {
	 System.out.printf("\n\n");
     int sum = 0; 
     for (int i = 0; i < arr.length; i++) 
     {
            sum += arr[i];
     }
     System.out.printf("Addition of elements of array = "+sum);
 }
}
public class ArraySum {

	public static void main(String[] args) 
	{
	       Scanner sc = new Scanner( System.in );
		   System.out.print("Enter array size :\n ");
		   int size = sc.nextInt();
		   int[] arr = new int[ size ];
		   
		   Array.acceptRecord( arr );  
		   Array.printRecord(arr);    
		   Array.Sum(arr);             
		   

	}

}
