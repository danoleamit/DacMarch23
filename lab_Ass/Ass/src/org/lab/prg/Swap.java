package org.lab.prg;

import java.util.Scanner;

	class Swap1{	
		private int A;
		private int B;	
		public void Swapping()
		{
			   System.out.println("Before Swapping= ");		   
			   System.out.println("A= "+this.A);
			   System.out.println("B= "+this.B);
			   this.A=this.A+this.B;
			   this.B=this.A-this.B;
			   this.A=this.A-this.B;		   
			   System.out.println("After Swapping= ");
			   System.out.println("A= "+A);
			   System.out.println("B= "+B);	   
	    }
		
		public void AcceptRecord()
		{		
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter number one= ");
			this.A=sc.nextInt();
			System.out.println("Enter number two= ");
			this.B=sc.nextInt();	
	    }
	}
	
	public class Swap
	{
		public static void main(String[] args) 
		{
			Swap1 swap = new Swap1();	
			swap.AcceptRecord();
			swap.Swapping();
		}
	}


