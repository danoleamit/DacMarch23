/*
4. Electricity Bill Calculation
Create a class named "ElectricityBill" that has the following instance variables:
a. customerName (String)
b. unitsConsumed (double)
c. billAmount (double)
Create a constructor that initializes the customerName and unitsConsumed instance
variables.
Define a method named "calculateBillAmount" that calculates the bill amount based 
on the number of units consumed. The formula for calculating the bill amount is:
a. For the first 100 units: Rs. 5 per unit
b. For the next 200 units: Rs. 7 per unit
c. For the remaining units: Rs. 10 per unit

Implement the "calculateBillAmount" method in the "ElectricityBill" class.
Define a main method that creates an object of the "ElectricityBill" class and sets the 
customerName and unitsConsumed instance variables. Then, call the 
"calculateBillAmount" method to calculate the bill amount and display the 
customerName, unitsConsumed, and billAmount.

 */

import java.util.*;

class ElectricityBill
{
  private String customerName ;
  private double unitsConsumed ;
  private double billAmount ;


  ElectricityBill ( )
  {

       
  }

  void setName(String customerName)
  {
    this.customerName=customerName;
  }
  void setUnit(int unitsConsumed)
  {
    this.unitsConsumed=unitsConsumed;
  }

  void calculateBillAmount()
  {
      
      if(this.unitsConsumed<=100)
         display(this.unitsConsumed*5);

       else if(this.unitsConsumed>100 && this.unitsConsumed<=200)
             display(this.unitsConsumed*7);
        else
        display(this.unitsConsumed*10);
      
  }

  void display(double bill)
  {
     System.out.println(" Payble Amount = "+bill);
  }

  

}

class Unit
{
    Scanner sc=new Scanner(System.in);
    ElectricityBill E1=new ElectricityBill();
    void Add_Customer_data()
    {  
        System.out.println("Enter customerName : "); 
            E1.setName(sc.nextLine());

    }
    
    void take_unit()
    { 
        System.out.print("Enter unitsConsumed : ");
        E1.setUnit(sc.nextInt());
        E1.calculateBillAmount();

    }
    
}

class Ass2_Q4
{
  public static void main(String[] args) 
  {


    Unit cst1=new Unit();
    cst1.Add_Customer_data();
    cst1.take_unit();
    

    
  }


}