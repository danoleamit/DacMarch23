import java.util.Scanner;
class Bill
{
    String custmername;
    double unitsconsumed;
    double billamount;

    Bill(String name,double units)
    {
        this.custmername=name;
        this.unitsconsumed=units;
    }
    double calculateBillAmount()
    {
        if(unitsconsumed<=100)
        {
            this.billamount=this.unitsconsumed*5;
        }
        if((unitsconsumed>100) && (unitsconsumed<=200))
        {
            this.billamount=this.unitsconsumed*7;
        }
        if(unitsconsumed>200)
        {
            this.billamount=this.unitsconsumed*10;
        }
        return this.billamount;
    }
}
class Q_4
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Custmer name & no of unit cunsumed :");
        String name =sc.nextLine();
        double units =sc.nextDouble();
        Bill b=new Bill(name,units);
        System.out.println("bill amount "+b.calculateBillAmount());

    }
}